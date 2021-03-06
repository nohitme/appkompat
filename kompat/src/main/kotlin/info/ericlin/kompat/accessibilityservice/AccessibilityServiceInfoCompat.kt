package info.ericlin.kompat.accessibilityservice

import android.accessibilityservice.AccessibilityServiceInfo
import android.content.pm.PackageManager
import android.support.v4.accessibilityservice.AccessibilityServiceInfoCompat

/**
 * Call through [AccessibilityServiceInfoCompat.getId]
 */
val AccessibilityServiceInfo.idCompat
    get() = AccessibilityServiceInfoCompat.getId(this)

/**
 * Call through [AccessibilityServiceInfoCompat.getResolveInfo]
 */
val AccessibilityServiceInfo.resolveInfoCompat
    get() = AccessibilityServiceInfoCompat.getResolveInfo(this)

/**
 * Call through [AccessibilityServiceInfoCompat.getSettingsActivityName]
 */
val AccessibilityServiceInfo.settingsActivityNameCompat
    get() = AccessibilityServiceInfoCompat.getSettingsActivityName(this)

/**
 * Call through [AccessibilityServiceInfoCompat.getCanRetrieveWindowContent]
 */
val AccessibilityServiceInfo.canRetrieveWindowContentCompat
    get() = AccessibilityServiceInfoCompat.getCanRetrieveWindowContent(this)

/**
 * Call through [AccessibilityServiceInfoCompat.loadDescription]
 */
fun AccessibilityServiceInfo.loadDescriptionCompat(packageManager: PackageManager) =
        AccessibilityServiceInfoCompat.loadDescription(this, packageManager)

/**
 * Call through [AccessibilityServiceInfoCompat.getCapabilities]
 */
val AccessibilityServiceInfo.capabilitiesCompat
    get() = AccessibilityServiceInfoCompat.getCapabilities(this)
