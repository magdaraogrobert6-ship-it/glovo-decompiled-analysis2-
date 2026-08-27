package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CountdownTime$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.Font;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "countdown")
public final class FontResourceLoader implements FontKt {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailable$CountdownTime$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CountdownTime$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 109;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Font font = Font.read;
            int i4 = read + 65;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return font;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String finishedDescription;
    public final String id;
    public final String notStartedDescription;
    public final List requiredSteps;
    public final String startedDescription;
    public final int timer;
    public final getWindowTitle timerStartAction;
    public final String title;
    public final List trackingEvents;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | i3;
        int i10 = i8 | i3;
        int i11 = (~((~i3) | i5)) | (~i10);
        int i12 = (~(i | i7 | i3)) | (~(i10 | i5));
        int i13 = i3 + i5 + i2 + (528639218 * i6) + ((-532493036) * i4);
        int i14 = i13 * i13;
        int i15 = ((i3 * 873666089) - 1460666368) + (873666089 * i5) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i2) + (1819279360 * i6) + ((-1621098496) * i4) + (586088448 * i14);
        int i16 = (i3 * (-1573143961)) + 2078511484 + (i5 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i2 * (-1573143025)) + (i6 * 123045422) + (i4 * (-1548035028)) + (i14 * 1845559296);
        return i15 + ((i16 * i16) * 1848705024) != 1 ? write(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.CustomerUnavailable$CountdownTime$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(8)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(9)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new DelegatingFontLoaderForDeprecatedUsage(10))};
        int i = serializer + 125;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 28 / 0;
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        FontResourceLoader fontResourceLoader = (FontResourceLoader) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return fontResourceLoader.timerStartAction;
        }
        int i3 = 87 / 0;
        return fontResourceLoader.timerStartAction;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        FontResourceLoader fontResourceLoader = (FontResourceLoader) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        List list = fontResourceLoader.trackingEvents;
        int i5 = i3 + 57;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.requiredSteps;
        }
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.title;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int RatingCompat() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 55;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.timer;
        int i6 = i2 + 35;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
        return i5;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 45;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.finishedDescription;
        int i5 = i2 + 103;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 65;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 115;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.startedDescription;
        int i4 = i3 + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = write + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.notStartedDescription;
        int i5 = i3 + 77;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ FontResourceLoader(int i, String str, String str2, String str3, String str4, String str5, int i2, getWindowTitle getwindowtitle, List list, List list2) {
        Object obj = null;
        if (291 != (i & 291)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 291, Font.read.getDescriptor());
            throw null;
        }
        this.id = str;
        this.title = str2;
        if ((i & 4) == 0) {
            this.notStartedDescription = null;
        } else {
            this.notStartedDescription = str3;
            int i3 = IconCompatParcelizer + 83;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.startedDescription = null;
        } else {
            this.startedDescription = str4;
        }
        if ((i & 16) == 0) {
            int i6 = write + 63;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                this.finishedDescription = null;
                obj.hashCode();
                throw null;
            }
            this.finishedDescription = null;
        } else {
            this.finishedDescription = str5;
        }
        int i7 = 2 % 2;
        this.timer = i2;
        if ((i & 64) == 0) {
            int i8 = IconCompatParcelizer + 69;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            this.timerStartAction = null;
        } else {
            this.timerStartAction = getwindowtitle;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            int i10 = write + 53;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                this.requiredSteps = instance_delegatelambda0.write;
                throw null;
            }
            this.requiredSteps = instance_delegatelambda0.write;
        } else {
            this.requiredSteps = list;
            int i11 = write + 29;
            IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 2 % 2;
            }
        }
        this.trackingEvents = list2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CountdownTime(id=", this.id, ", title=", this.title, ", notStartedDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.notStartedDescription, ", startedDescription=", this.startedDescription, ", finishedDescription=");
        sbM.append(this.finishedDescription);
        sbM.append(", timer=");
        sbM.append(this.timer);
        sbM.append(", timerStartAction=");
        sbM.append(this.timerStartAction);
        sbM.append(", requiredSteps=");
        sbM.append(this.requiredSteps);
        sbM.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.trackingEvents, ")");
        int i4 = IconCompatParcelizer + 75;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
        String str = this.notStartedDescription;
        if (str == null) {
            int i4 = write + 67;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.startedDescription;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.finishedDescription;
        if (str3 == null) {
            int i5 = IconCompatParcelizer + 33;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(this.timer, (((((iM + iHashCode) * 31) + iHashCode4) * 31) + iHashCode2) * 31, 31);
        getWindowTitle getwindowtitle = this.timerStartAction;
        if (getwindowtitle == null) {
            int i7 = IconCompatParcelizer + 85;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = getwindowtitle.hashCode();
        }
        int iHashCode5 = this.trackingEvents.hashCode() + c8$$ExternalSyntheticOutline0.m(this.requiredSteps, (iM2 + iHashCode3) * 31, 31);
        int i9 = IconCompatParcelizer + 81;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 4 / 0;
        }
        return iHashCode5;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 111;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FontResourceLoader)) {
            return false;
        }
        FontResourceLoader fontResourceLoader = (FontResourceLoader) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, fontResourceLoader.id}, getCieXyz.write())).booleanValue()) {
            int i4 = write + 9;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, fontResourceLoader.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.notStartedDescription, fontResourceLoader.notStartedDescription}, getCieXyz.write())).booleanValue()) {
            int i6 = write + 65;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.startedDescription, fontResourceLoader.startedDescription}, getCieXyz.write())).booleanValue()) {
            int i7 = IconCompatParcelizer + 5;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.finishedDescription, fontResourceLoader.finishedDescription}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.timer != fontResourceLoader.timer) {
            int i9 = IconCompatParcelizer + 109;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timerStartAction, fontResourceLoader.timerStartAction}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, fontResourceLoader.requiredSteps}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, fontResourceLoader.trackingEvents}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i11 = write + 19;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i11 % 2 != 0;
    }

    public final List MediaBrowserCompatMediaItem() {
        return (List) RemoteActionCompatParcelizer(new Object[]{this}, BackspaceCommand.write(), BackspaceCommand.write(), 736541880, BackspaceCommand.write(), -736541880, BackspaceCommand.write());
    }

    public final getWindowTitle MediaDescriptionCompat() {
        return (getWindowTitle) RemoteActionCompatParcelizer(new Object[]{this}, BackspaceCommand.write(), BackspaceCommand.write(), -1781365444, BackspaceCommand.write(), 1781365445, BackspaceCommand.write());
    }
}
