package com.mapbox.navigation.core.navigator.offline;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.onTouch;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class TilesetVersionsApi$json$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final TilesetVersionsApi$json$1 INSTANCE;
    public static final TilesetVersionsApi$json$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TilesetVersionsApi$json$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            onTouch ontouch = (onTouch) obj;
            ontouch.getClass();
            ontouch.MediaSessionCompatQueueItem = true;
            ontouch.MediaDescriptionCompat = true;
            return createfromparcel;
        }
        onTouch ontouch2 = (onTouch) obj;
        ontouch2.getClass();
        ontouch2.MediaSessionCompatQueueItem = true;
        ontouch2.MediaDescriptionCompat = true;
        return createfromparcel;
    }

    static {
        int i = 1;
        INSTANCE$1 = new TilesetVersionsApi$json$1(i, i);
        INSTANCE = new TilesetVersionsApi$json$1(i, 0);
    }
}
