package com.revature.retrofitstudy

data class result(
    var tags: List<String>,
    var _id:String,
    var author:String,
    var content:String,
    var authorSlug:String,
    var length:Int,
    var dateAdded:String,
    var dateModified:String
)
