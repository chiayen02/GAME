package tw.edu.pu.gm.s1091756.android

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Rect

class fly (context: Context){

    val res = context.resources
    var x:Int = 0
    var y:Int = res.displayMetrics.heightPixels/2
    var w:Int
    var h:Int
    var image: Bitmap
    var SrcRect: Rect
    lateinit var DestRect: Rect
    var count : Int = 1

    init {
        image = BitmapFactory.decodeResource(res, R.drawable.fly1)
        SrcRect = Rect(0, 0, image.width, image.height)
        w = image.width/5
        h = image.height/5
        y -= h/2
    }

    fun draw(canvas: Canvas) {
        DestRect = Rect(x, y, x + w, y + h)
        canvas.drawBitmap(image, SrcRect, DestRect, null)
    }

    fun update(){
        if (count==1){
            count = 2
            image = BitmapFactory.decodeResource(res, R.drawable.fly2)
        }
        else{
            count = 1
            image = BitmapFactory.decodeResource(res, R.drawable.fly1)
        }
    }
}