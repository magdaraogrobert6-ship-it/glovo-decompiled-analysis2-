package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.common.data.model.tasks.UtccComponent$TimerCard$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.Settings6EWAqTQ;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "timer_card")
public final class italic extends getWeightGVVA2EU {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final FontVariation completed;
    public final FontVariation disabled;
    public final String id;
    public final List requiredSteps;
    public final FontVariation running;
    public final int timerInSeconds;
    public final String title;
    public static final UtccComponent$TimerCard$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.UtccComponent$TimerCard$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 83;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Settings6EWAqTQ settings6EWAqTQ = Settings6EWAqTQ.IconCompatParcelizer;
                throw null;
            }
            Settings6EWAqTQ settings6EWAqTQ2 = Settings6EWAqTQ.IconCompatParcelizer;
            int i3 = serializer + 23;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return settings6EWAqTQ2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(16)), null, null, null, null};

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~i;
        int i10 = (~(i9 | i2)) | i8;
        int i11 = ~i5;
        int i12 = i11 | i2;
        int i13 = i10 | (~i12);
        int i14 = i7 | i;
        int i15 = i8 | (~i14);
        int i16 = (~(i5 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i));
        int i17 = i2 + i + i6 + ((-1254723898) * i3) + ((-1667789834) * i4);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i2) + 1379663872 + ((-481802647) * i) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i6) + ((-1033371648) * i3) + ((-106430464) * i4) + (1552875520 * i18);
        int i20 = ((i2 * (-402395399)) - 1316031342) + (i * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i6 * (-402393527)) + (i3 * (-1219896714)) + (i4 * (-610841306)) + (i18 * (-825819136));
        if (i19 + (i20 * i20 * (-1063190528)) != 1) {
            return write(objArr);
        }
        italic italicVar = (italic) objArr[0];
        int i21 = 2 % 2;
        int i22 = read;
        int i23 = i22 + 83;
        IconCompatParcelizer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i24 = i23 % 2;
        String str = italicVar.title;
        int i25 = i22 + 111;
        IconCompatParcelizer = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i26 = i25 % 2;
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.UtccComponent$TimerCard$Companion] */
    static {
        Object obj = null;
        int i = RemoteActionCompatParcelizer + 103;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        italic italicVar = (italic) objArr[0];
        int i = 2 % 2;
        int i2 = read + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return italicVar.disabled;
        }
        FontVariation fontVariation = italicVar.disabled;
        throw null;
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.requiredSteps;
        }
        int i3 = 35 / 0;
        return this.requiredSteps;
    }

    public final int MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = read + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = this.timerInSeconds;
        int i6 = i3 + 7;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 85;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 55;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FontVariation serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 21;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        FontVariation fontVariation = this.running;
        int i5 = i2 + 33;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return fontVariation;
        }
        throw null;
    }

    public final FontVariation write() {
        int i = 2 % 2;
        int i2 = read + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.completed;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public /* synthetic */ italic(int i, String str, String str2, List list, int i2, FontVariation fontVariation, FontVariation fontVariation2, FontVariation fontVariation3) {
        if (9 == (i & 9)) {
            this.id = str;
            if ((i & 2) == 0) {
                this.title = null;
                int i3 = IconCompatParcelizer + 33;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } else {
                this.title = str2;
                int i5 = read + 9;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            }
            if ((i & 4) == 0) {
                this.requiredSteps = instance_delegatelambda0.write;
            } else {
                this.requiredSteps = list;
            }
            this.timerInSeconds = i2;
            if ((i & 16) == 0) {
                this.disabled = null;
            } else {
                this.disabled = fontVariation;
            }
            if ((i & 32) == 0) {
                this.running = null;
            } else {
                this.running = fontVariation2;
            }
            if ((i & 64) == 0) {
                this.completed = null;
                return;
            } else {
                this.completed = fontVariation3;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 9, Settings6EWAqTQ.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f A[PHI: r1 r3
  0x002f: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r3v14 java.lang.String) = (r3v0 java.lang.String), (r3v16 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.id.hashCode();
            str = this.title;
            if (str == null) {
                int i3 = IconCompatParcelizer + 73;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            iHashCode = this.id.hashCode();
            str = this.title;
            if (str == null) {
                int i5 = IconCompatParcelizer + 73;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        }
        int iM = af$$ExternalSyntheticOutline0.m(this.timerInSeconds, c8$$ExternalSyntheticOutline0.m(this.requiredSteps, ((iHashCode * 31) + iHashCode2) * 31, 31), 31);
        FontVariation fontVariation = this.disabled;
        if (fontVariation == null) {
            int i7 = IconCompatParcelizer + 93;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = fontVariation.hashCode();
        }
        FontVariation fontVariation2 = this.running;
        if (fontVariation2 == null) {
            int i9 = read + 97;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = fontVariation2.hashCode();
        }
        FontVariation fontVariation3 = this.completed;
        return ((((iM + iHashCode3) * 31) + iHashCode4) * 31) + (fontVariation3 != null ? fontVariation3.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TimerCard(id=", this.id, ", title=", this.title, ", requiredSteps=");
        sbM.append(this.requiredSteps);
        sbM.append(", timerInSeconds=");
        sbM.append(this.timerInSeconds);
        sbM.append(", disabled=");
        sbM.append(this.disabled);
        sbM.append(", running=");
        sbM.append(this.running);
        sbM.append(", completed=");
        sbM.append(this.completed);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 57;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof italic)) {
            return false;
        }
        italic italicVar = (italic) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, italicVar.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, italicVar.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, italicVar.requiredSteps}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.timerInSeconds != italicVar.timerInSeconds) {
            int i4 = read + 41;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 14 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.disabled, italicVar.disabled}, getCieXyz.write())).booleanValue()) {
            int i6 = read + 99;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.running, italicVar.running}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.completed, italicVar.completed}, getCieXyz.write())).booleanValue()) {
            int i7 = IconCompatParcelizer + 113;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = read + 49;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }

    public final String MediaMetadataCompat() {
        int iRemoteActionCompatParcelizer = io.sentry.util.network.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = io.sentry.util.network.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(-478558032, 478558033, io.sentry.util.network.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), new Object[]{this}, io.sentry.util.network.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
    }

    public final FontVariation read() {
        int iRemoteActionCompatParcelizer = io.sentry.util.network.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = io.sentry.util.network.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        return (FontVariation) RemoteActionCompatParcelizer(407152491, -407152491, io.sentry.util.network.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), new Object[]{this}, io.sentry.util.network.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
    }
}
