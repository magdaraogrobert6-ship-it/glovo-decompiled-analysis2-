package com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmButtonV1UiModelImpl$confirm$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RemoteActionCompatParcelizer;
    public final /* synthetic */ ConfirmButtonV1UiModelImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmButtonV1UiModelImpl$confirm$1(ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = confirmButtonV1UiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ConfirmButtonV1UiModelImpl$confirm$1 confirmButtonV1UiModelImpl$confirm$1 = new ConfirmButtonV1UiModelImpl$confirm$1(this.serializer, shortNewsContentCardView);
        int i2 = read + 77;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return confirmButtonV1UiModelImpl$confirm$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 23;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((ConfirmButtonV1UiModelImpl$confirm$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = read + 71;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0136 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:31:0x0073, B:33:0x007d, B:36:0x0083, B:39:0x0089, B:40:0x009b, B:43:0x00ab, B:45:0x00c1, B:47:0x00c6, B:54:0x00fe, B:74:0x0152, B:78:0x0163, B:87:0x0188, B:81:0x0170, B:84:0x017d, B:57:0x0107, B:61:0x0112, B:62:0x0116, B:66:0x0128, B:68:0x0132, B:71:0x013f, B:72:0x0149, B:20:0x0040, B:23:0x0048), top: B:103:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #1 {all -> 0x01a6, blocks: (B:31:0x0073, B:33:0x007d, B:36:0x0083, B:39:0x0089, B:40:0x009b, B:43:0x00ab, B:45:0x00c1, B:47:0x00c6, B:54:0x00fe, B:74:0x0152, B:78:0x0163, B:87:0x0188, B:81:0x0170, B:84:0x017d, B:57:0x0107, B:61:0x0112, B:62:0x0116, B:66:0x0128, B:68:0x0132, B:71:0x013f, B:72:0x0149, B:20:0x0040, B:23:0x0048), top: B:103:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128 A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:31:0x0073, B:33:0x007d, B:36:0x0083, B:39:0x0089, B:40:0x009b, B:43:0x00ab, B:45:0x00c1, B:47:0x00c6, B:54:0x00fe, B:74:0x0152, B:78:0x0163, B:87:0x0188, B:81:0x0170, B:84:0x017d, B:57:0x0107, B:61:0x0112, B:62:0x0116, B:66:0x0128, B:68:0x0132, B:71:0x013f, B:72:0x0149, B:20:0x0040, B:23:0x0048), top: B:103:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0132 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #1 {all -> 0x01a6, blocks: (B:31:0x0073, B:33:0x007d, B:36:0x0083, B:39:0x0089, B:40:0x009b, B:43:0x00ab, B:45:0x00c1, B:47:0x00c6, B:54:0x00fe, B:74:0x0152, B:78:0x0163, B:87:0x0188, B:81:0x0170, B:84:0x017d, B:57:0x0107, B:61:0x0112, B:62:0x0116, B:66:0x0128, B:68:0x0132, B:71:0x013f, B:72:0x0149, B:20:0x0040, B:23:0x0048), top: B:103:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x0163 A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:31:0x0073, B:33:0x007d, B:36:0x0083, B:39:0x0089, B:40:0x009b, B:43:0x00ab, B:45:0x00c1, B:47:0x00c6, B:54:0x00fe, B:74:0x0152, B:78:0x0163, B:87:0x0188, B:81:0x0170, B:84:0x017d, B:57:0x0107, B:61:0x0112, B:62:0x0116, B:66:0x0128, B:68:0x0132, B:71:0x013f, B:72:0x0149, B:20:0x0040, B:23:0x0048), top: B:103:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x016f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0170 A[Catch: all -> 0x01a6, TryCatch #1 {all -> 0x01a6, blocks: (B:31:0x0073, B:33:0x007d, B:36:0x0083, B:39:0x0089, B:40:0x009b, B:43:0x00ab, B:45:0x00c1, B:47:0x00c6, B:54:0x00fe, B:74:0x0152, B:78:0x0163, B:87:0x0188, B:81:0x0170, B:84:0x017d, B:57:0x0107, B:61:0x0112, B:62:0x0116, B:66:0x0128, B:68:0x0132, B:71:0x013f, B:72:0x0149, B:20:0x0040, B:23:0x0048), top: B:103:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x017c  */
    /* JADX WARN: Code duplicated, block: B:84:0x017d A[Catch: all -> 0x01a6, TryCatch #1 {all -> 0x01a6, blocks: (B:31:0x0073, B:33:0x007d, B:36:0x0083, B:39:0x0089, B:40:0x009b, B:43:0x00ab, B:45:0x00c1, B:47:0x00c6, B:54:0x00fe, B:74:0x0152, B:78:0x0163, B:87:0x0188, B:81:0x0170, B:84:0x017d, B:57:0x0107, B:61:0x0112, B:62:0x0116, B:66:0x0128, B:68:0x0132, B:71:0x013f, B:72:0x0149, B:20:0x0040, B:23:0x0048), top: B:103:0x0014 }] */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0185, code lost:
    
        if (com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl.access$onConfirmFailure(r9, r2, r1, r17) == r10) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlinx.coroutines.CoroutineStart, o.ShortNewsContentCardView, o.TextAnnouncementContentCardView] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl$confirm$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
