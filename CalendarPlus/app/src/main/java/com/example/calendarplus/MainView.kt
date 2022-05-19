package com.example.calendarplus
import android.content.Context
import android.util.AttributeSet
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Paint.Style
import android.graphics.Typeface
import android.view.View
import androidx.core.graphics.blue

public class MainView : View {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)
    val canvasWidth = width.toFloat()
    val canvasHeight = height.toFloat()

    private var backgroundPaint: Paint
    private var titlePaint : Paint
    private var calendarplusPaint: Paint
    init{
        backgroundPaint = Paint().apply {
            // Set up the paint style
            setStyle(Style.FILL)
            setColor(Color.parseColor("#00185B"))
        }
        titlePaint = Paint().apply {
            // Set up the paint style
            setStyle(Style.FILL)
            setColor(Color.parseColor("#DBBE00"))
        }
        calendarplusPaint = Paint().apply {
            // Set up the paint style
            setStyle(Style.FILL)
            setColor(Color.WHITE)
            setTextSize(100f)
        }

        }
        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
            val canvasWidth = width.toFloat()
            val canvasHeight = height.toFloat()
            canvas.drawRect(0f, 0f, canvasWidth, canvasHeight, backgroundPaint)
            canvas.drawRect(50f, 50f, canvasWidth-50, canvasHeight/10, titlePaint)
            canvas.drawText("Calendar +",300f,(canvasHeight/10)-50,calendarplusPaint)
            canvas.drawRect(50f, (canvasHeight/10)*2, canvasWidth-50, ((canvasHeight/10)*3.5).toFloat(), titlePaint)
        }
//
}