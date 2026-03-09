package app.morphe.patches.fotmob.ads

import app.morphe.patcher.extensions.InstructionExtensions.addInstruction
import app.morphe.patcher.patch.bytecodePatch

@Suppress("unused")
val hideAdsPatch = bytecodePatch(
    name = "Hide ads",
    description = "Hides ads in Fotmob.",
) {
    compatibleWith("com.mobilefootie.wc2010")

    execute {
        FotmobAdsFingerprint.method.addInstruction(
            0,
            "return-void",
        )
    }
}
