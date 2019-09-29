package com.example.kotlinrecyclerview

import com.example.kotlinrecyclerview.models.BlogPost

class DataSource {
    companion object {
        fun createDataSet(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Dell XPS Thin and Light Laptop-15",
                    "15.6 4K Touch Display, Intel Core i7-7700HQ, 16 GB RAM, 1 TB SSD, GTX 1050",
                    "https://images-na.ssl-images-amazon.com/images/I/71xuuIhlLAL._SL1500_.jpg",
                    "DELL"
                )
            )
            list.add(
                BlogPost(
                    "ASUS ZenBook S13",
                    "Ultra Thin & Light Laptop 13.9” FHD, Intel Core i7-8565U CPU, GeForce MX150, 8GB RAM",
                    "https://img-us1.asus.com/A/show/AW000706/2019/0305/AM0000002/201903AM050000002_15517353933494420003814.jpg",
                    "ASUS"
                )
            )

            list.add(
                BlogPost(
                    "Microsoft Surface Laptop (1st Gen) DAL-00001 Laptop",
                    "(Windows 10 S, Intel Core i7, 13.5 LED-Lit Screen",
                    "https://images-na.ssl-images-amazon.com/images/I/41erPQLRs5L.jpg",
                    "MICROSOFT"
                )
            )
            list.add(
                BlogPost(
                    "Acer Swift 7",
                    "Acer's Swift 7 is the slimmest ultraportable you can buy, a trait that pairs well with its 4G LTE service",
                    "https://assets.pcmag.com/media/images/510159-the-world-s-thinnest-laptop.jpg?width=810&height=456",
                    "ACER"
                )
            )
            list.add(
                BlogPost(
                    "Hands-on with HP's Spectre 13.3",
                    "The Spectre 13.3 ultraportable laptop sports crazy cabinet hinges and a new logo, and it's thinner than an iPad Pro.",
                    "https://img.etimg.com/thumb/msid-52865754,width-640,resizemode-4,imgsize-48664/worlds-thinnest-laptop-hp-spectre-13.jpg",
                    "HP"
                )
            )
            list.add(
                BlogPost(
                    "MacBook Air",
                    "13.3 Retina Display features a 2560 x 1600 screen resolution and a 16:10 aspect ratio for 227 pixels per inch (PPI)",
                    "https://media.wired.com/photos/5bd883dc5b66a763e54f0b22/191:100/pass/macbookair3.jpg",
                    "APPLE"
                )
            )
            list.add(
                BlogPost(
                    "Lenovo Ideapad 15.6",
                    "HD Premium High Performance Laptop, AMD A12-9720P Quad core processor 2.7GHz, 8GB DDR4, 1TB HDD, DVD, Webcam, WiFi,Bluetooth",
                    "https://images-na.ssl-images-amazon.com/images/I/61hoTcz8p0L._SL1000_.jpg",
                    "Lenovo"
                )
            )
            list.add(
                BlogPost(
                    "AORUS 15-W9-7UK0252W Gaming Laptop",
                    "Intel Core i7-8750H 2.2GHz, 16GB, 2TB HDD, 512GB SSD, 15.6 Full HD 1920 x 1080, NVIDIA RTX 2060 6GB, Windows 10 Home",
                    "https://img.ebyrcdn.net/910870-877880-800.jpg",
                    "AORUS"
                )
            )
            return list
        }
    }
}