package com.mapbox.maps;

/* JADX INFO: loaded from: classes4.dex */
public interface SnapshotStyleListener {

    /* JADX INFO: loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static void onDidFailLoadingStyle(SnapshotStyleListener snapshotStyleListener, String str) {
            str.getClass();
        }

        public static void onDidFullyLoadStyle(SnapshotStyleListener snapshotStyleListener, Style style) {
            style.getClass();
        }

        public static void onStyleImageMissing(SnapshotStyleListener snapshotStyleListener, String str) {
            str.getClass();
        }
    }

    void onDidFailLoadingStyle(String str);

    void onDidFinishLoadingStyle(Style style);

    void onDidFullyLoadStyle(Style style);

    void onStyleImageMissing(String str);
}
