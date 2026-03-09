package app.morphe.patches.fotmob.ads

import app.morphe.patcher.Fingerprint

internal object FotmobAdsFingerprint : Fingerprint(
    returnType = "V",
    strings = listOf("admob", "ad_unit"),
)
