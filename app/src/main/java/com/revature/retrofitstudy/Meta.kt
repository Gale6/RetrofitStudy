package com.revature.retrofitstudy

data class Meta(
    var count:Int,
    var totalCount:Int,
    var page:Int,
    var totalPage:Int,
    var lastItemIndex:Int,
    var results: List<result>

)