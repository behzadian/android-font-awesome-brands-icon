package farayan.commons.components

import android.content.Context
import android.util.AttributeSet
import farayan.commons.components.font.icon.awesome.brand.R

class FontAwesomeBrandIcon : FixedResourceFontTextView {

    constructor(@androidx.annotation.NonNull context: Context) : super(context)
    constructor(@androidx.annotation.NonNull context: Context, attrs: AttributeSet?) : super(context, attrs) {
        loadAttrs(attrs)
    }

    constructor(@androidx.annotation.NonNull context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        loadAttrs(attrs, defStyleAttr)
    }


    private fun loadAttrs(attrs: AttributeSet?, defStyleAttr: Int = 0) {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.FontAwesomeBrandIcon, defStyleAttr, 0)
        try {
            val textCode = typedArray.getInt(R.styleable.FontAwesomeBrandIcon_Brand, 0);
            text = textCode.toChar().toString();
            typeface = theFont(context, typefaceResID())
        } finally {
            typedArray.recycle();
        }
    }

    override val inheritedFontResID: Int
        get() = R.font.font_awesome_5_brands_regular_400;
}
