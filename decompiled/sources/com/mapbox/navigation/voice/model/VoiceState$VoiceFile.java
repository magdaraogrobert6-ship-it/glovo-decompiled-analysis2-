package com.mapbox.navigation.voice.model;

import java.io.File;
import o.collapsePeerui;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class VoiceState$VoiceFile extends collapsePeerui {
    public final File instructionFile;

    public final int hashCode() {
        return this.instructionFile.hashCode();
    }

    public VoiceState$VoiceFile(File file) {
        file.getClass();
        this.instructionFile = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceState$VoiceFile)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.instructionFile, ((VoiceState$VoiceFile) obj).instructionFile}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "VoiceFile(instructionFile=" + this.instructionFile + ')';
    }
}
