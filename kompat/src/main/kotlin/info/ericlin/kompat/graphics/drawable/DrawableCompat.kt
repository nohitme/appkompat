package info.ericlin.kompat.graphics.drawable

import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.support.annotation.ColorInt
import android.support.v4.graphics.drawable.DrawableCompat
import android.util.AttributeSet
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import java.io.IOException

/**
 * Call through [DrawableCompat.jumpToCurrentState]
 */
fun Drawable.jumpToCurrentStateCompat() = DrawableCompat.jumpToCurrentState(this)

/**
 * Call through [DrawableCompat.setAutoMirrored] and [DrawableCompat.isAutoMirrored]
 */
var Drawable.isAutoMirroredCompat
    get() = DrawableCompat.isAutoMirrored(this)
    set(value) = DrawableCompat.setAutoMirrored(this, value)

/**
 * Call through [DrawableCompat.setHotspot]
 */
fun Drawable.setHotspotCompat(x: Float, y: Float) = DrawableCompat.setHotspot(this, x, y)

/**
 * Call through [DrawableCompat.setHotspotBounds]
 */
fun Drawable.setHotspotBoundsCompat(left: Int, top: Int, right: Int, bottom: Int) =
        DrawableCompat.setHotspotBounds(this, left, top, right, bottom)

/**
 * Call through [DrawableCompat.setTint]
 */
fun Drawable.setTintCompat(@ColorInt tint: Int) = DrawableCompat.setTint(this, tint)

/**
 * Call through [DrawableCompat.setTintList]
 */
fun Drawable.setTintListCompat(tint: ColorStateList?) = DrawableCompat.setTintList(this, tint)

/**
 * Call through [DrawableCompat.setTintMode]
 */
fun Drawable.setTintModeCompat(tintMode: PorterDuff.Mode?) = DrawableCompat.setTintMode(this, tintMode)

/**
 * Call through [DrawableCompat.getAlpha] and [Drawable.setAlpha]
 */
var Drawable.alphaCompat
    get() = DrawableCompat.getAlpha(this)
    set(value) {
        this.alpha = value
    }

/**
 * Call through [DrawableCompat.applyTheme]
 */
fun Drawable.Compat(theme: Resources.Theme) = DrawableCompat.applyTheme(this, theme)

/**
 * Call through [DrawableCompat.canApplyTheme]
 */
fun Drawable.canApplyThemeCompat() = DrawableCompat.canApplyTheme(this)

/**
 * Call through [DrawableCompat.getColorFilter] and [Drawable.getColorFilter]
 */
var Drawable.colorFilterCompat: ColorFilter?
    get() = DrawableCompat.getColorFilter(this)
    set(value) {
        this.colorFilter = value
    }

/**
 * Call through [DrawableCompat.clearColorFilter]
 */
fun Drawable.clearColorFilterCompat() = DrawableCompat.clearColorFilter(this)

/**
 * Call through [DrawableCompat.inflate]
 */
@Throws(XmlPullParserException::class, IOException::class)
fun Drawable.inflateCompat(resources: Resources,
                           parser: XmlPullParser,
                           attrs: AttributeSet,
                           theme: Resources.Theme? = null) =
        DrawableCompat.inflate(this, resources, parser, attrs, theme)

/**
 * Call through [DrawableCompat.wrap]
 */
fun Drawable.wrapCompat() = DrawableCompat.wrap(this)

/**
 * Call through [DrawableCompat.unwrap]
 */
fun <T : Drawable> Drawable.unwrapCompat() = DrawableCompat.unwrap<T>(this)

/**
 * Call through [DrawableCompat.setLayoutDirection]
 */
fun Drawable.setLayoutDirectionCompat(layoutDirection: Int) = DrawableCompat.setLayoutDirection(this, layoutDirection)

/**
 * Call through [DrawableCompat.getLayoutDirection] and [DrawableCompat.setLayoutDirection]
 *
 * Note [DrawableCompat.setLayoutDirection] returns a boolean. Use the compat method directly if you need the return value.
 */
var Drawable.layoutDirectionCompat
    get() = DrawableCompat.getLayoutDirection(this)
    set(value) {
        DrawableCompat.setLayoutDirection(this, value)
    }