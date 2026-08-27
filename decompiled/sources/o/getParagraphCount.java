package o;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getParagraphCount extends AdaptedFunctionReference implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getParagraphCount(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.IconCompatParcelizer = i3;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        if (this.IconCompatParcelizer == 0) {
            return ((analyzeBidi) this.MediaSessionCompatQueueItem).serializer((BringIntoViewNoderequester111) obj, (setUpdateBlock) obj2, (FocusTargetPropertiesNode) obj3);
        }
        loadAsync loadasync = (loadAsync) obj;
        getAppSetId getappsetid = (getAppSetId) obj2;
        getClipBounds getclipbounds = (getClipBounds) obj3;
        setGdprForgetMe setgdprforgetme = (setGdprForgetMe) this.MediaSessionCompatQueueItem;
        setgdprforgetme.getClass();
        loadasync.getClass();
        getappsetid.getClass();
        getclipbounds.getClass();
        boolean z = getappsetid instanceof getAdvertisingInfoObject;
        boolean z2 = loadasync.write;
        boolean z3 = getclipbounds instanceof drawText;
        if (!z) {
            int i2 = write;
            int i3 = i2 + 73;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
            if (!z2) {
                int i4 = i2 + 15;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (!z3) {
                    saveRawReferrerArray saverawreferrerarray = saveRawReferrerArray.serializer;
                    int i6 = write + 37;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return saverawreferrerarray;
                }
            }
        }
        return new saveControlParams(setgdprforgetme.write.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings));
    }
}
