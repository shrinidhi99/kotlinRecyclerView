package com.example.kotlinrecyclerview.models

class BlogPost(
    var title: String,
    var body: String,
    var image: String,
    var username: String
) {
    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) {
            return false
        }
        other as BlogPost
        if (title != other.title) {
            return false
        }
        if (image != other.image) {
            return false
        }
        if (body != other.body) {
            return false
        }
        return true
    }

    override fun toString(): String {
        return "BlogPost(title=$title, body=$body, image=$image)"
    }
}