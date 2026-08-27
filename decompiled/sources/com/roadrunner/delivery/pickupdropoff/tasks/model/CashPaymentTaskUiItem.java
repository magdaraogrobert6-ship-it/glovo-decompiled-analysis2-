package com.roadrunner.delivery.pickupdropoff.tasks.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.mapbox.search.result.SearchResult;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import o.AnimatedVisibilityState;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.TargetState;
import o.getCieXyz;
import o.isInline;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;
import o.uiMode;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class CashPaymentTaskUiItem implements uiMode {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final Companion Companion = new Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String actionTitle;
    public final String cancelActionTitle;
    public final String currency;
    public final String description;
    public final String doneActionTitle;
    public final boolean editable;
    public final Double editedAmount;
    public final ReasonItem editedReason;
    public final String editedReasonLabel;
    public final String formattedEditedAmount;
    public final String formattedOriginalAmount;
    public final String formattedSelectedAmount;
    public final boolean isOptional;
    public final String note;
    public final Double originalAmount;
    public final Reasons reasons;
    public final String requiredText;
    public final Double selectedAmount;
    public final ReasonItem selectedReason;
    public final String taskId;
    public final String title;
    public final List trackingEvent;
    public final isInline transferChangeItem;
    public final UiMode uiMode;
    public final String validation;

    public final class Companion {
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            TargetState targetState;
            int i = 2 % 2;
            int i2 = serializer + 23;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                targetState = TargetState.read;
                int i3 = 8 / 0;
            } else {
                targetState = TargetState.read;
            }
            int i4 = IconCompatParcelizer + 55;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return targetState;
            }
            throw null;
        }
    }

    @Serializable
    public final class ReasonItem implements Parcelable {
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;
        private static int serializer = 1;
        private static int write;
        public final String key;
        public final String value;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<ReasonItem> CREATOR = new SearchResult.Creator(28);

        public static final class Companion {
            private static int read = 0;
            private static int write = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = read + 89;
                write = i2 % Fields.SpotShadowColor;
                Object obj = null;
                if (i2 % 2 == 0) {
                    CashPaymentTaskUiItem$ReasonItem$$serializer cashPaymentTaskUiItem$ReasonItem$$serializer = CashPaymentTaskUiItem$ReasonItem$$serializer.serializer;
                    throw null;
                }
                CashPaymentTaskUiItem$ReasonItem$$serializer cashPaymentTaskUiItem$ReasonItem$$serializer2 = CashPaymentTaskUiItem$ReasonItem$$serializer.serializer;
                int i3 = read + 91;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return cashPaymentTaskUiItem$ReasonItem$$serializer2;
                }
                obj.hashCode();
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = serializer + 53;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 81;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = read + 11;
            write = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public /* synthetic */ ReasonItem(int i, String str, String str2) {
            if (3 == (i & 3)) {
                this.key = str;
                this.value = str2;
            } else {
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, CashPaymentTaskUiItem$ReasonItem$$serializer.serializer.getDescriptor());
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = serializer + 51;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                parcel.getClass();
                parcel.writeString(this.key);
                parcel.writeString(this.value);
            } else {
                parcel.getClass();
                parcel.writeString(this.key);
                parcel.writeString(this.value);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 61;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ReasonItem(key=", this.key, ", value=", this.value, ")");
            int i4 = serializer + 43;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return strWrite;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = serializer + 27;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.value.hashCode() + (this.key.hashCode() * 31);
            int i4 = RemoteActionCompatParcelizer + 1;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public ReasonItem(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.key = str;
            this.value = str2;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReasonItem)) {
                int i2 = RemoteActionCompatParcelizer + 41;
                serializer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            ReasonItem reasonItem = (ReasonItem) obj;
            Object[] objArr = {this.key, reasonItem.key};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 73;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            Object[] objArr2 = {this.value, reasonItem.value};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = RemoteActionCompatParcelizer + 111;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
    }

    @Serializable
    public final class Reasons implements Parcelable {
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 0;
        private static int serializer = 1;
        public final String description;
        public final String editedReasonPrefix;
        public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk items;
        public final String title;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Reasons> CREATOR = new SearchResult.Creator(29);

        public static final class Companion {
            private static int RemoteActionCompatParcelizer = 1;
            private static int write;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 107;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                CashPaymentTaskUiItem$Reasons$$serializer cashPaymentTaskUiItem$Reasons$$serializer = CashPaymentTaskUiItem$Reasons$$serializer.write;
                int i4 = RemoteActionCompatParcelizer + 97;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return cashPaymentTaskUiItem$Reasons$$serializer;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = read + 45;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            return i2 % 2 == 0 ? 1 : 0;
        }

        static {
            int i = serializer + 1;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public /* synthetic */ Reasons(int i, String str, String str2, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str3) {
            if (15 == (i & 15)) {
                this.title = str;
                this.description = str2;
                this.items = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
                this.editedReasonPrefix = str3;
                return;
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, CashPaymentTaskUiItem$Reasons$$serializer.write.getDescriptor());
            throw null;
        }

        public Reasons(String str, String str2, String str3, r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
            str.getClass();
            str2.getClass();
            r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
            str3.getClass();
            this.title = str;
            this.description = str2;
            this.items = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
            this.editedReasonPrefix = str3;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 75;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
            int iHashCode = this.editedReasonPrefix.hashCode() + ((this.items.hashCode() + iM) * 31);
            int i4 = IconCompatParcelizer + 3;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = read + 99;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Reasons(title=", this.title, ", description=", this.description, ", items=");
            sbM.append(this.items);
            sbM.append(", editedReasonPrefix=");
            sbM.append(this.editedReasonPrefix);
            sbM.append(")");
            String string = sbM.toString();
            int i4 = IconCompatParcelizer + 63;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return string;
            }
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = read + 55;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.items;
            parcel.writeInt(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size());
            Iterator it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
            while (it.hasNext()) {
                int i5 = read + 27;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ((ReasonItem) it.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.editedReasonPrefix);
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Reasons) {
                Reasons reasons = (Reasons) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, reasons.title}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, reasons.description}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.items, reasons.items}, getCieXyz.write())).booleanValue()) {
                        int i2 = read + 85;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.editedReasonPrefix, reasons.editedReasonPrefix}, getCieXyz.write())).booleanValue();
                }
                int i4 = IconCompatParcelizer + 15;
                read = i4 % Fields.SpotShadowColor;
                return i4 % 2 != 0;
            }
            int i5 = IconCompatParcelizer + 39;
            int i6 = i5 % Fields.SpotShadowColor;
            read = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 31;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 81 / 0;
            }
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public final class UiMode {
        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
        private static final /* synthetic */ UiMode[] $VALUES;
        private static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate;
        public static final Companion Companion;
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;
        private static int write;
        public static final UiMode ViewPayment = new UiMode("ViewPayment", 0);
        public static final UiMode EditPayment = new UiMode("EditPayment", 1);

        private UiMode(String str, int i) {
            super(str, i);
        }

        public static final /* synthetic */ onViewDetachedFromWindowlambda1 access$get$cachedSerializer$delegate$cp() {
            int i = 2 % 2;
            int i2 = read + 7;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return $cachedSerializer$delegate;
            }
            int i3 = 23 / 0;
            return $cachedSerializer$delegate;
        }

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 + 35;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i5 = i2 + 117;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 72 / 0;
            }
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }

        /* JADX INFO: renamed from: $r8$lambda$HdevVG0Gmk6B-wKtNN8VIxy7kEk, reason: not valid java name */
        public static /* synthetic */ setGraphicModalMaxWidthDp m4943$r8$lambda$HdevVG0Gmk6BwKtNN8VIxy7kEk() {
            int i = 2 % 2;
            int i2 = write + 123;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return _init_$_anonymous_();
            }
            int i3 = 35 / 0;
            return _init_$_anonymous_();
        }

        static {
            UiMode[] uiModeArr$values = $values();
            $VALUES = uiModeArr$values;
            $ENTRIES = UtilsKt.read((Enum[]) uiModeArr$values);
            Companion = new Companion();
            $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(24));
            int i = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r5 == com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode.EditPayment) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r5 == com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode.EditPayment) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r1 = r1 + 55;
            com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r1 = r1 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean isInEditMode() {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode.write
                int r2 = r1 + 99
                int r3 = r2 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode.read = r3
                int r2 = r2 % r0
                r3 = 0
                if (r2 != 0) goto L17
                com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$UiMode r2 = com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode.EditPayment
                r4 = 8
                int r4 = r4 / r3
                if (r5 != r2) goto L24
                goto L1b
            L17:
                com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$UiMode r2 = com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode.EditPayment
                if (r5 != r2) goto L24
            L1b:
                int r1 = r1 + 55
                int r2 = r1 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode.read = r2
                int r1 = r1 % r0
                r0 = 1
                return r0
            L24:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode.isInEditMode():boolean");
        }

        public final boolean isInViewMode() {
            int i = 2 % 2;
            if (this != ViewPayment) {
                return false;
            }
            int i2 = write + 31;
            int i3 = i2 % Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }

        private static final /* synthetic */ UiMode[] $values() {
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 + 27;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            UiMode[] uiModeArr = {ViewPayment, EditPayment};
            int i5 = i2 + 99;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return uiModeArr;
            }
            throw null;
        }

        public static UiMode valueOf(String str) {
            int i = 2 % 2;
            int i2 = read + 3;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            UiMode uiMode = (UiMode) Enum.valueOf(UiMode.class, str);
            int i4 = write + 117;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return uiMode;
        }

        public static UiMode[] values() {
            int i = 2 % 2;
            int i2 = write + 15;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            UiMode[] uiModeArr = (UiMode[]) $VALUES.clone();
            int i4 = write + 93;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return uiModeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class Companion {
            private static int RemoteActionCompatParcelizer = 1;
            private static int write;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = write + 111;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) UiMode.access$get$cachedSerializer$delegate$cp().MediaSessionCompatResultReceiverWrapper();
                int i4 = write + 107;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return setgraphicmodalmaxwidthdp;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private static final setGraphicModalMaxWidthDp _init_$_anonymous_() {
            int i = 2 % 2;
            UiMode[] uiModeArrValues = values();
            uiModeArrValues.getClass();
            EnumSerializer enumSerializer = new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.UiMode", (Enum[]) uiModeArrValues);
            int i2 = write + 15;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return enumSerializer;
        }
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~(i4 | i5)) | i3;
        int i8 = i5 | i4 | i3;
        int i9 = ~i4;
        int i10 = i4 + i3 + i + ((-421447895) * i2) + ((-859425246) * i6);
        int i11 = i10 * i10;
        int i12 = (i4 * (-629045104)) + 1817116672 + ((-629045104) * i3) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i) + ((-2125594624) * i2) + (888930304 * i6) + (441384960 * i11);
        int i13 = (i4 * 1303038832) + 2077918271 + (i3 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i * 1303038783) + (i2 * 1583617559) + (i6 * (-1102559138)) + (i11 * 510722048);
        int i14 = i12 + (i13 * i13 * 607191040);
        if (i14 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i14 != 2) {
            return i14 != 3 ? read(objArr) : write(objArr);
        }
        return serializer(objArr);
    }

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(22)), null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new AnimatedVisibilityState(23))};
        int i = IconCompatParcelizer + 33;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 89;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return cashPaymentTaskUiItem.validation;
        }
        String str = cashPaymentTaskUiItem.validation;
        throw null;
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.taskId;
        int i5 = i3 + 97;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 29;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.editedReasonLabel;
        int i5 = i2 + 93;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = read + 83;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.formattedEditedAmount;
        }
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = serializer + 79;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.formattedSelectedAmount;
        }
        throw null;
    }

    public final Double MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = serializer + 1;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Double d = this.selectedAmount;
        int i4 = i3 + 101;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return d;
        }
        throw null;
    }

    public final ReasonItem ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ReasonItem reasonItem = this.selectedReason;
        int i4 = i3 + 81;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return reasonItem;
    }

    public final UiMode PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = read + 21;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.uiMode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ReasonItem RatingCompat() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 43;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ReasonItem reasonItem = this.editedReason;
        int i5 = i2 + 17;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return reasonItem;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = read + 17;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        boolean z = this.isOptional;
        int i5 = i3 + 109;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return z;
    }

    public final Double serializer() {
        int i = 2 % 2;
        int i2 = serializer + 101;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.editedAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ CashPaymentTaskUiItem(int i, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d, Reasons reasons, Double d2, Double d3, ReasonItem reasonItem, ReasonItem reasonItem2, String str9, String str10, String str11, String str12, UiMode uiMode, String str13, boolean z2, String str14, isInline isinline, List list) {
        if (33554431 == (i & 33554431)) {
            this.taskId = str;
            this.isOptional = z;
            this.currency = str2;
            this.description = str3;
            this.title = str4;
            this.actionTitle = str5;
            this.doneActionTitle = str6;
            this.cancelActionTitle = str7;
            this.note = str8;
            this.originalAmount = d;
            this.reasons = reasons;
            this.selectedAmount = d2;
            this.editedAmount = d3;
            this.selectedReason = reasonItem;
            this.editedReason = reasonItem2;
            this.formattedOriginalAmount = str9;
            this.formattedSelectedAmount = str10;
            this.formattedEditedAmount = str11;
            this.validation = str12;
            this.uiMode = uiMode;
            this.requiredText = str13;
            this.editable = z2;
            this.editedReasonLabel = str14;
            this.transferChangeItem = isinline;
            this.trackingEvent = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 33554431, TargetState.read.getDescriptor());
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        if (cashPaymentTaskUiItem == obj) {
            return true;
        }
        if (!(obj instanceof CashPaymentTaskUiItem)) {
            return false;
        }
        CashPaymentTaskUiItem cashPaymentTaskUiItem2 = (CashPaymentTaskUiItem) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.taskId, cashPaymentTaskUiItem2.taskId}, getCieXyz.write())).booleanValue() || cashPaymentTaskUiItem.isOptional != cashPaymentTaskUiItem2.isOptional) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.currency, cashPaymentTaskUiItem2.currency}, getCieXyz.write())).booleanValue()) {
            int i2 = read + 83;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.description, cashPaymentTaskUiItem2.description}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.title, cashPaymentTaskUiItem2.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.actionTitle, cashPaymentTaskUiItem2.actionTitle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.doneActionTitle, cashPaymentTaskUiItem2.doneActionTitle}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.cancelActionTitle, cashPaymentTaskUiItem2.cancelActionTitle}, getCieXyz.write())).booleanValue()) {
            int i4 = read + 29;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.note, cashPaymentTaskUiItem2.note}, getCieXyz.write())).booleanValue()) {
            int i6 = read + 5;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.originalAmount, cashPaymentTaskUiItem2.originalAmount}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.reasons, cashPaymentTaskUiItem2.reasons}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.selectedAmount, cashPaymentTaskUiItem2.selectedAmount}, getCieXyz.write())).booleanValue()) {
            int i8 = serializer + 73;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.editedAmount, cashPaymentTaskUiItem2.editedAmount}, getCieXyz.write())).booleanValue()) {
            int i10 = serializer + 85;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.selectedReason, cashPaymentTaskUiItem2.selectedReason}, getCieXyz.write())).booleanValue()) {
            int i12 = read + 21;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.editedReason, cashPaymentTaskUiItem2.editedReason}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.formattedOriginalAmount, cashPaymentTaskUiItem2.formattedOriginalAmount}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.formattedSelectedAmount, cashPaymentTaskUiItem2.formattedSelectedAmount}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.formattedEditedAmount, cashPaymentTaskUiItem2.formattedEditedAmount}, getCieXyz.write())).booleanValue()) {
            int i14 = read + 41;
            serializer = i14 % Fields.SpotShadowColor;
            return i14 % 2 == 0;
        }
        if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.validation, cashPaymentTaskUiItem2.validation}, getCieXyz.write())).booleanValue()) || cashPaymentTaskUiItem.uiMode != cashPaymentTaskUiItem2.uiMode) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.requiredText, cashPaymentTaskUiItem2.requiredText}, getCieXyz.write())).booleanValue() || cashPaymentTaskUiItem.editable != cashPaymentTaskUiItem2.editable) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.editedReasonLabel, cashPaymentTaskUiItem2.editedReasonLabel}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.transferChangeItem, cashPaymentTaskUiItem2.transferChangeItem}, getCieXyz.write())).booleanValue()) {
            int i15 = serializer + 117;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cashPaymentTaskUiItem.trackingEvent, cashPaymentTaskUiItem2.trackingEvent}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i17 = serializer + 33;
        read = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        return false;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) objArr[0];
        int i = 2 % 2;
        int i2 = read + 101;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Double d = cashPaymentTaskUiItem.selectedAmount;
            throw null;
        }
        Double d2 = cashPaymentTaskUiItem.selectedAmount;
        if (d2 == null || removeNodeAtDepth.read(d2, cashPaymentTaskUiItem.originalAmount)) {
            return false;
        }
        int i3 = serializer + 51;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (((java.lang.Boolean) RemoteActionCompatParcelizer(io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.write(), io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.write(), 42748691, -42748689, new java.lang.Object[]{r10}, io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.write(), io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.write())).booleanValue() != true) goto L12;
     */
    @Override // o.uiMode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean write() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.serializer
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.read = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L4f
            com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$UiMode r1 = r10.uiMode
            boolean r1 = r1.isInViewMode()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L44
            boolean r1 = r10.isOptional
            if (r1 != 0) goto L43
            java.lang.Object[] r7 = new java.lang.Object[]{r10}
            int r8 = io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.write()
            int r3 = io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.write()
            int r4 = io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.write()
            int r9 = io.reactivex.subjects.BehaviorSubject.BehaviorDisposable.write()
            r6 = -42748689(0xfffffffffd73b4ef, float:-2.0246366E37)
            r5 = 42748691(0x28c4b13, float:2.0614242E-37)
            java.lang.Object r1 = RemoteActionCompatParcelizer(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == r2) goto L43
            goto L44
        L43:
            return r2
        L44:
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.serializer
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.read = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        L4f:
            com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem$UiMode r0 = r10.uiMode
            r0.isInViewMode()
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem.write():boolean");
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        ReasonItem reasonItem = this.editedReason;
        if (reasonItem != null) {
            int i2 = read + 63;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                String str = reasonItem.value;
                throw null;
            }
            String str2 = reasonItem.value;
            if (str2 != null) {
                return str2;
            }
        }
        Reasons reasons = this.reasons;
        String str3 = reasons != null ? reasons.title : null;
        if (str3 != null) {
            return str3;
        }
        int i3 = serializer + 91;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return "";
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.uiMode.isInViewMode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.uiMode.isInViewMode()) {
            return this.formattedEditedAmount;
        }
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        if (!((Boolean) RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), 42748691, -42748689, new Object[]{this}, iWrite, BehaviorSubject.BehaviorDisposable.write())).booleanValue()) {
            return this.formattedOriginalAmount;
        }
        String str = this.formattedSelectedAmount;
        int i3 = serializer + 77;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final boolean MediaSessionCompatToken() {
        Double d;
        int i = 2 % 2;
        int i2 = read + 53;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            int i4 = 50 / 0;
            if (this.reasons != null) {
                int i5 = i3 + 101;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (!this.uiMode.isInEditMode() && (d = this.editedAmount) != null && !removeNodeAtDepth.read(d, this.originalAmount)) {
                    return true;
                }
            }
        } else if (this.reasons != null) {
            int i7 = i3 + 101;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (!this.uiMode.isInEditMode()) {
            }
        }
        return false;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        String strValueOf;
        boolean zMatches;
        CashPaymentTaskUiItem cashPaymentTaskUiItem = (CashPaymentTaskUiItem) objArr[0];
        int i = 2 % 2;
        int i2 = serializer + 55;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = cashPaymentTaskUiItem.validation;
        if (str.length() == 0) {
            zMatches = true;
        } else {
            Double d = cashPaymentTaskUiItem.editedAmount;
            if (d == null || (strValueOf = String.valueOf(d.doubleValue())) == null) {
                strValueOf = "";
            }
            str.getClass();
            Pattern patternCompile = Pattern.compile(str);
            patternCompile.getClass();
            zMatches = patternCompile.matcher(strValueOf).matches();
        }
        if ((cashPaymentTaskUiItem.MediaSessionCompatToken() && cashPaymentTaskUiItem.editedReason == null) || !zMatches) {
            return false;
        }
        int i4 = serializer + 21;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public CashPaymentTaskUiItem(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d, Reasons reasons, Double d2, Double d3, ReasonItem reasonItem, ReasonItem reasonItem2, String str9, String str10, String str11, String str12, UiMode uiMode, String str13, boolean z2, String str14, isInline isinline, List list) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        uiMode.getClass();
        this.taskId = str;
        this.isOptional = z;
        this.currency = str2;
        this.description = str3;
        this.title = str4;
        this.actionTitle = str5;
        this.doneActionTitle = str6;
        this.cancelActionTitle = str7;
        this.note = str8;
        this.originalAmount = d;
        this.reasons = reasons;
        this.selectedAmount = d2;
        this.editedAmount = d3;
        this.selectedReason = reasonItem;
        this.editedReason = reasonItem2;
        this.formattedOriginalAmount = str9;
        this.formattedSelectedAmount = str10;
        this.formattedEditedAmount = str11;
        this.validation = str12;
        this.uiMode = uiMode;
        this.requiredText = str13;
        this.editable = z2;
        this.editedReasonLabel = str14;
        this.transferChangeItem = isinline;
        this.trackingEvent = list;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("CashPaymentTaskUiItem(taskId=", this.taskId, ", isOptional=", ", currency=", this.isOptional);
        c8$$ExternalSyntheticOutline0.m(sbM, this.currency, ", description=", this.description, ", title=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.title, ", actionTitle=", this.actionTitle, ", doneActionTitle=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.doneActionTitle, ", cancelActionTitle=", this.cancelActionTitle, ", note=");
        sbM.append(this.note);
        sbM.append(", originalAmount=");
        sbM.append(this.originalAmount);
        sbM.append(", reasons=");
        sbM.append(this.reasons);
        sbM.append(", selectedAmount=");
        sbM.append(this.selectedAmount);
        sbM.append(", editedAmount=");
        sbM.append(this.editedAmount);
        sbM.append(", selectedReason=");
        sbM.append(this.selectedReason);
        sbM.append(", editedReason=");
        sbM.append(this.editedReason);
        sbM.append(", formattedOriginalAmount=");
        sbM.append(this.formattedOriginalAmount);
        sbM.append(", formattedSelectedAmount=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.formattedSelectedAmount, ", formattedEditedAmount=", this.formattedEditedAmount, ", validation=");
        sbM.append(this.validation);
        sbM.append(", uiMode=");
        sbM.append(this.uiMode);
        sbM.append(", requiredText=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.requiredText, ", editable=", ", editedReasonLabel=", sbM, this.editable);
        sbM.append(this.editedReasonLabel);
        sbM.append(", transferChangeItem=");
        sbM.append(this.transferChangeItem);
        sbM.append(", trackingEvent=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.trackingEvent, ")");
        int i4 = serializer + 61;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public static CashPaymentTaskUiItem RemoteActionCompatParcelizer(CashPaymentTaskUiItem cashPaymentTaskUiItem, Double d, Double d2, ReasonItem reasonItem, ReasonItem reasonItem2, String str, String str2, String str3, UiMode uiMode, String str4, int i) {
        Double d3;
        String str5;
        UiMode uiMode2;
        int i2 = 2 % 2;
        int i3 = read + 105;
        int i4 = i3 % Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        String str6 = cashPaymentTaskUiItem.taskId;
        boolean z = cashPaymentTaskUiItem.isOptional;
        String str7 = cashPaymentTaskUiItem.currency;
        String str8 = cashPaymentTaskUiItem.description;
        String str9 = cashPaymentTaskUiItem.title;
        String str10 = cashPaymentTaskUiItem.actionTitle;
        String str11 = cashPaymentTaskUiItem.doneActionTitle;
        String str12 = cashPaymentTaskUiItem.cancelActionTitle;
        String str13 = cashPaymentTaskUiItem.note;
        Double d4 = cashPaymentTaskUiItem.originalAmount;
        Reasons reasons = cashPaymentTaskUiItem.reasons;
        if ((i & Fields.CameraDistance) != 0) {
            int i6 = i4 + 125;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                d3 = cashPaymentTaskUiItem.selectedAmount;
            } else {
                Double d5 = cashPaymentTaskUiItem.selectedAmount;
                throw null;
            }
        } else {
            d3 = d;
        }
        Double d6 = (i & Fields.TransformOrigin) != 0 ? cashPaymentTaskUiItem.editedAmount : d2;
        ReasonItem reasonItem3 = (i & 8192) != 0 ? cashPaymentTaskUiItem.selectedReason : reasonItem;
        ReasonItem reasonItem4 = (i & Fields.Clip) != 0 ? cashPaymentTaskUiItem.editedReason : reasonItem2;
        String str14 = cashPaymentTaskUiItem.formattedOriginalAmount;
        String str15 = (65536 & i) != 0 ? cashPaymentTaskUiItem.formattedSelectedAmount : str;
        if ((i & Fields.RenderEffect) != 0) {
            int i7 = i4 + 17;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            str5 = cashPaymentTaskUiItem.formattedEditedAmount;
        } else {
            str5 = str2;
        }
        String str16 = (262144 & i) != 0 ? cashPaymentTaskUiItem.validation : str3;
        if ((524288 & i) != 0) {
            int i9 = i4 + 113;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            uiMode2 = cashPaymentTaskUiItem.uiMode;
        } else {
            uiMode2 = uiMode;
        }
        String str17 = cashPaymentTaskUiItem.requiredText;
        boolean z2 = cashPaymentTaskUiItem.editable;
        String str18 = (i & 4194304) != 0 ? cashPaymentTaskUiItem.editedReasonLabel : str4;
        isInline isinline = cashPaymentTaskUiItem.transferChangeItem;
        List list = cashPaymentTaskUiItem.trackingEvent;
        cashPaymentTaskUiItem.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        m1$$ExternalSyntheticOutline0.m(str10, str11, str12, str14, str15);
        str5.getClass();
        str16.getClass();
        uiMode2.getClass();
        str18.getClass();
        return new CashPaymentTaskUiItem(str6, z, str7, str8, str9, str10, str11, str12, str13, d4, reasons, d3, d6, reasonItem3, reasonItem4, str14, str15, str5, str16, uiMode2, str17, z2, str18, isinline, list);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = serializer + 37;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.isOptional), 31, this.currency), 31, this.description), 31, this.title), 31, this.actionTitle), 31, this.doneActionTitle), 31, this.cancelActionTitle);
        String str = this.note;
        if (str == null) {
            int i4 = read + 93;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i6 = read + 73;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        Double d = this.originalAmount;
        if (d == null) {
            int i8 = serializer + 17;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = d.hashCode();
        }
        Reasons reasons = this.reasons;
        int iHashCode5 = reasons == null ? 0 : reasons.hashCode();
        Double d2 = this.selectedAmount;
        int iHashCode6 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.editedAmount;
        int iHashCode7 = d3 == null ? 0 : d3.hashCode();
        ReasonItem reasonItem = this.selectedReason;
        if (reasonItem == null) {
            int i10 = read + 17;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = reasonItem.hashCode();
        }
        ReasonItem reasonItem2 = this.editedReason;
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((((((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + (reasonItem2 == null ? 0 : reasonItem2.hashCode())) * 31, 31, this.formattedOriginalAmount), 31, this.formattedSelectedAmount), 31, this.formattedEditedAmount), 31, this.validation);
        int iHashCode8 = this.uiMode.hashCode();
        String str2 = this.requiredText;
        if (str2 == null) {
            int i12 = read + 13;
            serializer = i12 % Fields.SpotShadowColor;
            iHashCode4 = i12 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = str2.hashCode();
        }
        int iM3 = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((((iHashCode8 + iM2) * 31) + iHashCode4) * 31, 31, this.editable), 31, this.editedReasonLabel);
        isInline isinline = this.transferChangeItem;
        int iHashCode9 = isinline == null ? 0 : isinline.hashCode();
        List list = this.trackingEvent;
        return ((iM3 + iHashCode9) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        return ((Boolean) RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), 42748691, -42748689, new Object[]{this}, iWrite, BehaviorSubject.BehaviorDisposable.write())).booleanValue();
    }

    public final String ComponentActivity() {
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        return (String) RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -1261427077, 1261427080, new Object[]{this}, iWrite, BehaviorSubject.BehaviorDisposable.write());
    }

    public final boolean PlaybackStateCompat() {
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        return ((Boolean) RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -1494128477, 1494128477, new Object[]{this}, iWrite, BehaviorSubject.BehaviorDisposable.write())).booleanValue();
    }

    public final boolean equals(Object obj) {
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        return ((Boolean) RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -441867115, 441867116, new Object[]{this, obj}, iWrite, BehaviorSubject.BehaviorDisposable.write())).booleanValue();
    }
}
