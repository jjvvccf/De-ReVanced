package app.morphe.patches.fotmob.ads

import app.morphe.patcher.patch.bytecodePatch
import app.morphe.util.returnEarly

@Suppress("unused")
val hideAdsPatch = bytecodePatch(
    name = "Hide ads",
    description = "Hides ads in Fotmob.",
) {
    compatibleWith("com.mobilefootie.wc2010")

    execute {
        ShouldDisplayAdsFingerprint.method.returnEarly(false)
    }
}
