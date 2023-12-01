package medium.containerWithMostWater
//  https://leetcode.com/problems/container-with-most-water/

import java.lang.Integer.min
import kotlin.math.max

fun maxArea(height: IntArray): Int {
    /*
    var area = 0
    height.forEachIndexed { starterIdx, i ->
        for(finisherIdx in starterIdx until height.size){
            val widthSize =  finisherIdx-starterIdx
            val heightSize = min(i, height[finisherIdx])
            if(heightSize*widthSize>area) area=heightSize*widthSize
        }
    }
    return area
    */  //  Too slow
    if(height.size<=1) return 0
    var area = 0
    var left = 0
    var right = height.size-1
    while (left < right){
        val width = right-left
        val tempArea = width * min(height[left], height[right])
        if(tempArea > area) area = tempArea
        if(height[left]>height[right]){
            right--
        }else{
            left++
        }
    }
    return area
}