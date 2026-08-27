package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$Companion;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getBox;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class makeTreedefault implements uiMode {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailableTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$Companion
        private static int read = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 121;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getBox.serializer;
            }
            getBox getbox = getBox.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final ContextCache cancelOrderData;
    public final List componentIds;
    public final List components;
    public final r8lambdakX1auGmjk4nKnxFqVYyTYqzkc customerData;
    public final String description;
    public final getStable dispatcherData;
    public final boolean isOptional;
    public final String taskId;
    public final fixedHeightOenEA2s taskState;
    public final Integer timerSeconds;
    public final getNoopState timerStartAction;
    public final String title;
    public final List trackingEvents;

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        int i2 = serializer + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(27)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(28)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(29)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(1)), null};
        int i = write + 23;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.taskId;
        int i5 = i3 + 1;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final fixedHeightOenEA2s RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 77;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        fixedHeightOenEA2s fixedheightoenea2s = this.taskState;
        int i5 = i2 + 5;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return fixedheightoenea2s;
        }
        throw null;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.isOptional;
        }
        throw null;
    }

    public final getStable serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        getStable getstable = this.dispatcherData;
        int i4 = i2 + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getstable;
    }

    public /* synthetic */ makeTreedefault(int i, String str, boolean z, String str2, String str3, Integer num, r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc, getStable getstable, ContextCache contextCache, getNoopState getnoopstate, List list, List list2, List list3, fixedHeightOenEA2s fixedheightoenea2s) {
        fixedHeightOenEA2s fixedheightoenea2s2;
        if (4095 == (i & 4095)) {
            this.taskId = str;
            this.isOptional = z;
            this.title = str2;
            this.description = str3;
            this.timerSeconds = num;
            this.customerData = r8lambdakx1augmjk4nknxfqvyytyqzkc;
            this.dispatcherData = getstable;
            this.cancelOrderData = contextCache;
            this.timerStartAction = getnoopstate;
            this.components = list;
            this.trackingEvents = list2;
            this.componentIds = list3;
            if ((i & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0) {
                fixedheightoenea2s2 = new fixedHeightOenEA2s();
            } else {
                int i2 = read + 103;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
                fixedheightoenea2s2 = fixedheightoenea2s;
            }
            this.taskState = fixedheightoenea2s2;
            int i4 = serializer + 53;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 4095, getBox.serializer.getDescriptor());
        throw null;
    }

    public makeTreedefault(String str, boolean z, String str2, String str3, Integer num, r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc, getStable getstable, ContextCache contextCache, getNoopState getnoopstate, List list, List list2, List list3, fixedHeightOenEA2s fixedheightoenea2s) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list2.getClass();
        this.taskId = str;
        this.isOptional = z;
        this.title = str2;
        this.description = str3;
        this.timerSeconds = num;
        this.customerData = r8lambdakx1augmjk4nknxfqvyytyqzkc;
        this.dispatcherData = getstable;
        this.cancelOrderData = contextCache;
        this.timerStartAction = getnoopstate;
        this.components = list;
        this.trackingEvents = list2;
        this.componentIds = list3;
        this.taskState = fixedheightoenea2s;
    }

    public /* synthetic */ makeTreedefault(String str, boolean z, String str2, String str3, Integer num, r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc, getStable getstable, ContextCache contextCache, getNoopState getnoopstate, ArrayList arrayList, List list, ArrayList arrayList2) {
        this(str, z, str2, str3, num, r8lambdakx1augmjk4nknxfqvyytyqzkc, getstable, contextCache, getnoopstate, arrayList, list, arrayList2, new fixedHeightOenEA2s());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e A[PHI: r4 r5 r6 r7 r8 r9
  0x003e: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v8 java.lang.String) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r5v2 boolean) = (r5v1 boolean), (r5v5 boolean) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r8v1 java.lang.Integer) = (r8v0 java.lang.Integer), (r8v3 java.lang.Integer) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r9v1 o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc) = (r9v0 o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc), (r9v3 o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023 A[PHI: r4 r5 r6 r7 r8 r9
  0x0023: PHI (r4v7 java.lang.String) = (r4v2 java.lang.String), (r4v8 java.lang.String) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r5v4 boolean) = (r5v1 boolean), (r5v5 boolean) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r7v3 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r8v2 java.lang.Integer) = (r8v0 java.lang.Integer), (r8v3 java.lang.Integer) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r9v2 o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc) = (r9v0 o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc), (r9v3 o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc) binds: [B:9:0x003c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public static makeTreedefault write(makeTreedefault maketreedefault, getStable getstable, ContextCache contextCache, fixedHeightOenEA2s fixedheightoenea2s, int i) {
        String str;
        boolean z;
        String str2;
        String str3;
        Integer num;
        r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc;
        String str4;
        boolean z2;
        String str5;
        String str6;
        Integer num2;
        r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc2;
        getStable getstable2;
        fixedHeightOenEA2s fixedheightoenea2s2;
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            str = maketreedefault.taskId;
            z = maketreedefault.isOptional;
            str2 = maketreedefault.title;
            str3 = maketreedefault.description;
            num = maketreedefault.timerSeconds;
            r8lambdakx1augmjk4nknxfqvyytyqzkc = maketreedefault.customerData;
            if ((i & 97) != 0) {
                str4 = str;
                z2 = z;
                str5 = str2;
                str6 = str3;
                num2 = num;
                r8lambdakx1augmjk4nknxfqvyytyqzkc2 = r8lambdakx1augmjk4nknxfqvyytyqzkc;
                getstable2 = maketreedefault.dispatcherData;
            } else {
                getstable2 = getstable;
                str4 = str;
                z2 = z;
                str5 = str2;
                str6 = str3;
                num2 = num;
                r8lambdakx1augmjk4nknxfqvyytyqzkc2 = r8lambdakx1augmjk4nknxfqvyytyqzkc;
            }
        } else {
            str = maketreedefault.taskId;
            z = maketreedefault.isOptional;
            str2 = maketreedefault.title;
            str3 = maketreedefault.description;
            num = maketreedefault.timerSeconds;
            r8lambdakx1augmjk4nknxfqvyytyqzkc = maketreedefault.customerData;
            if ((i & 64) != 0) {
                str4 = str;
                z2 = z;
                str5 = str2;
                str6 = str3;
                num2 = num;
                r8lambdakx1augmjk4nknxfqvyytyqzkc2 = r8lambdakx1augmjk4nknxfqvyytyqzkc;
                getstable2 = maketreedefault.dispatcherData;
            } else {
                getstable2 = getstable;
                str4 = str;
                z2 = z;
                str5 = str2;
                str6 = str3;
                num2 = num;
                r8lambdakx1augmjk4nknxfqvyytyqzkc2 = r8lambdakx1augmjk4nknxfqvyytyqzkc;
            }
        }
        ContextCache contextCache2 = (i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? maketreedefault.cancelOrderData : contextCache;
        getNoopState getnoopstate = maketreedefault.timerStartAction;
        List list = maketreedefault.components;
        List list2 = maketreedefault.trackingEvents;
        List list3 = maketreedefault.componentIds;
        if ((i & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0) {
            int i5 = i3 + 59;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            fixedheightoenea2s2 = maketreedefault.taskState;
        } else {
            fixedheightoenea2s2 = fixedheightoenea2s;
        }
        maketreedefault.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        fixedheightoenea2s2.getClass();
        return new makeTreedefault(str4, z2, str5, str6, num2, r8lambdakx1augmjk4nknxfqvyytyqzkc2, getstable2, contextCache2, getnoopstate, list, list2, list3, fixedheightoenea2s2);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = read + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.isOptional), 31, this.title), 31, this.description);
        Integer num = this.timerSeconds;
        int iHashCode4 = 0;
        if (num == null) {
            int i4 = serializer + 83;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc = this.customerData;
        int iHashCode5 = r8lambdakx1augmjk4nknxfqvyytyqzkc == null ? 0 : r8lambdakx1augmjk4nknxfqvyytyqzkc.hashCode();
        getStable getstable = this.dispatcherData;
        if (getstable == null) {
            int i6 = serializer + 51;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = getstable.hashCode();
        }
        ContextCache contextCache = this.cancelOrderData;
        if (contextCache == null) {
            int i8 = serializer + 115;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode3 = i8 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = contextCache.hashCode();
            int i9 = read + 27;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        getNoopState getnoopstate = this.timerStartAction;
        if (getnoopstate != null) {
            iHashCode4 = getnoopstate.hashCode();
            int i11 = serializer + 125;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        return this.taskState.hashCode() + c8$$ExternalSyntheticOutline0.m(this.componentIds, c8$$ExternalSyntheticOutline0.m(this.trackingEvents, c8$$ExternalSyntheticOutline0.m(this.components, (((((((((iM + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("CustomerUnavailableTaskUiItem(taskId=", this.taskId, ", isOptional=", ", title=", this.isOptional);
        c8$$ExternalSyntheticOutline0.m(sbM, this.title, ", description=", this.description, ", timerSeconds=");
        sbM.append(this.timerSeconds);
        sbM.append(", customerData=");
        sbM.append(this.customerData);
        sbM.append(", dispatcherData=");
        sbM.append(this.dispatcherData);
        sbM.append(", cancelOrderData=");
        sbM.append(this.cancelOrderData);
        sbM.append(", timerStartAction=");
        sbM.append(this.timerStartAction);
        sbM.append(", components=");
        sbM.append(this.components);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(", componentIds=");
        sbM.append(this.componentIds);
        sbM.append(", taskState=");
        sbM.append(this.taskState);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 55;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof makeTreedefault))) {
            makeTreedefault maketreedefault = (makeTreedefault) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, maketreedefault.taskId}, getCieXyz.write())).booleanValue() || this.isOptional != maketreedefault.isOptional) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, maketreedefault.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, maketreedefault.description}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timerSeconds, maketreedefault.timerSeconds}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customerData, maketreedefault.customerData}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dispatcherData, maketreedefault.dispatcherData}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cancelOrderData, maketreedefault.cancelOrderData}, getCieXyz.write())).booleanValue()) {
                    int i2 = serializer + 55;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timerStartAction, maketreedefault.timerStartAction}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, maketreedefault.components}, getCieXyz.write())).booleanValue()) {
                    int i3 = serializer + 79;
                    read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i3 % 2 == 0;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, maketreedefault.trackingEvents}, getCieXyz.write())).booleanValue()) {
                    int i4 = serializer + 55;
                    int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    read = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 53;
                    serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        int i8 = 7 / 0;
                    }
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.componentIds, maketreedefault.componentIds}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskState, maketreedefault.taskState}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i9 = read + 103;
                serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i9 % 2 != 0;
            }
            int i10 = serializer + 29;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = serializer + 61;
        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }
}
