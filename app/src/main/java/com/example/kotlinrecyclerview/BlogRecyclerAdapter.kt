package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.kotlinrecyclerview.models.BlogPost
import kotlinx.android.synthetic.main.layout_blog_list_item.view.*

class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_blog_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is BlogViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    fun submitList(blogList: List<BlogPost>) {
        val oldList = items
        val diffResult: DiffUtil.DiffResult = DiffUtil.calculateDiff(
            BlogItemDiffCallback(
                oldList,
                blogList
            )
        )
        items = blogList
        diffResult.dispatchUpdatesTo(this)
    }


    class BlogItemDiffCallback(
        var oldBlogList: List<BlogPost>,
        var newBlogList: List<BlogPost>
    ) : DiffUtil.Callback() {
        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return (oldBlogList[oldItemPosition].title == newBlogList[newItemPosition].title)
        }

        override fun getOldListSize(): Int {
            return oldBlogList.size
        }

        override fun getNewListSize(): Int {
            return newBlogList.size
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldBlogList[oldItemPosition].equals(newBlogList[newItemPosition])
        }

    }

    class BlogViewHolder constructor(
        itemView: View

    ) : RecyclerView.ViewHolder(itemView) {
        private val blogImage = itemView.blog_image
        private val blogTitle = itemView.blog_title
        private val blogAuthor = itemView.blog_author

        fun bind(blogPost: BlogPost) {
            blogTitle.text = blogPost.title
            blogAuthor.text = blogPost.username
            val requestOptions = RequestOptions().placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(itemView.context).applyDefaultRequestOptions(requestOptions)
                .load(blogPost.image).into(blogImage)
        }
    }

}