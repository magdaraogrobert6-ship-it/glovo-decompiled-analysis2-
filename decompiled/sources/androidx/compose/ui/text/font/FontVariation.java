package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DrawableTransformation;
import o.MediaSessionCompatQueueItem;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.getCieXyz;
import o.onContentCardClicked;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class FontVariation {
    public static final int $stable = 0;
    public static final FontVariation INSTANCE = new FontVariation();

    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density density);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class SettingTextUnit implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* JADX INFO: renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m3215getValueXSAIIZE() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            if (density != null) {
                return density.getFontScale() * TextUnit.m3867getValueimpl(this.value);
            }
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("density must not be null");
            DrawableTransformation.read();
            return 0.0f;
        }

        private SettingTextUnit(String str, long j) {
            this.axisName = str;
            this.value = j;
            this.needsDensity = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getAxisName(), settingTextUnit.getAxisName()}, getCieXyz.write())).booleanValue() && TextUnit.m3864equalsimpl0(this.value, settingTextUnit.value);
        }

        public int hashCode() {
            return TextUnit.m3868hashCodeimpl(this.value) + (getAxisName().hashCode() * 31);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + ((Object) TextUnit.m3874toStringimpl(this.value)) + ')';
        }

        public /* synthetic */ SettingTextUnit(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }
    }

    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final List<Setting> settings;

        public final boolean getNeedsDensity$ui_text() {
            return this.needsDensity;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }

        public Settings(Setting... settingArr) {
            boolean z = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                int i = 0;
                for (Setting setting2 : settingArr) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setting2.getAxisName(), axisName}, getCieXyz.write())).booleanValue()) {
                        i++;
                    }
                }
                if (i != 1) {
                    StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("'", axisName, "' must be unique. Actual [");
                    ArrayList arrayList = new ArrayList();
                    for (Setting setting3 : settingArr) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setting3.getAxisName(), axisName}, getCieXyz.write())).booleanValue()) {
                            arrayList.add(setting3);
                        }
                    }
                    sbM.append(arrayList);
                    sbM.append(']');
                    InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
                }
                z = z || setting.getNeedsDensity();
            }
            this.settings = onContentCardClicked.RatingCompat(settingArr);
            this.needsDensity = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Settings)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.settings, ((Settings) obj).settings}, getCieXyz.write())).booleanValue();
        }
    }

    private FontVariation() {
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class SettingFloat implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }

        public SettingFloat(String str, float f) {
            this.axisName = str;
            this.value = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getAxisName(), settingFloat.getAxisName()}, getCieXyz.write())).booleanValue() && this.value == settingFloat.value;
        }

        public int hashCode() {
            return Float.hashCode(this.value) + (getAxisName().hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
            sb.append(getAxisName());
            sb.append("', value=");
            return MediaSessionCompatQueueItem.serializer(sb, this.value, ')');
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class SettingInt implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }

        public SettingInt(String str, int i) {
            this.axisName = str;
            this.value = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getAxisName(), settingInt.getAxisName()}, getCieXyz.write())).booleanValue() && this.value == settingInt.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
            sb.append(getAxisName());
            sb.append("', value=");
            return af$$ExternalSyntheticOutline0.m(sb, this.value, ')');
        }
    }

    /* JADX INFO: renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m3213Settings6EWAqTQ(FontWeight fontWeight, int i, Setting... settingArr) {
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0(3);
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(weight(fontWeight.getWeight()));
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(italic(i));
        applydisplaycutoutmarginstocontentarealambda0.serializer(settingArr);
        ArrayList arrayList = applydisplaycutoutmarginstocontentarealambda0.write;
        return new Settings((Setting[]) arrayList.toArray(new Setting[arrayList.size()]));
    }

    /* JADX INFO: renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m3214opticalSizingR2X_6o(long j) {
        if (!TextUnit.m3870isSpimpl(j)) {
            InlineClassHelperKt.throwIllegalArgumentException("'opsz' must be provided in sp units");
        }
        return new SettingTextUnit("opsz", j, null);
    }

    public final Setting grade(int i) {
        if (-1000 > i || i >= 1001) {
            InlineClassHelperKt.throwIllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new SettingInt("GRAD", i);
    }

    public final Setting width(float f) {
        if (f <= 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("'wdth' must be strictly > 0.0f. Actual: " + f);
        }
        return new SettingFloat("wdth", f);
    }

    public final Setting weight(int i) {
        if (1 > i || i >= 1001) {
            InlineClassHelperKt.throwIllegalArgumentException("'wght' value must be in [1, 1000]. Actual: " + i);
        }
        return new SettingInt("wght", i);
    }

    public final Setting Setting(String str, float f) {
        if (str.length() != 4) {
            InlineClassHelperKt.throwIllegalArgumentException("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new SettingFloat(str, f);
    }

    public final Setting italic(float f) {
        if (0.0f > f || f > 1.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("'ital' must be in 0.0f..1.0f. Actual: " + f);
        }
        return new SettingFloat("ital", f);
    }

    public final Setting slant(float f) {
        if (-90.0f > f || f > 90.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("'slnt' must be in -90f..90f. Actual: " + f);
        }
        return new SettingFloat("slnt", f);
    }
}
