package com.scottyab.rootbeer;

import o.r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg;

/* JADX INFO: loaded from: classes3.dex */
public class RootBeerNative {
    public static final boolean RemoteActionCompatParcelizer;

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);

    static {
        try {
            System.loadLibrary("toolChecker");
            RemoteActionCompatParcelizer = true;
        } catch (UnsatisfiedLinkError e) {
            r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.read(e);
        }
    }
}
