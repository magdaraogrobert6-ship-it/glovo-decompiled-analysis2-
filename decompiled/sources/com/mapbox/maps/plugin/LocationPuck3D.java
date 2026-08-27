package com.mapbox.maps.plugin;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationPuck3D extends LocationPuck {
    public static final Parcelable.Creator<LocationPuck3D> CREATOR = new Vw.yn(3);
    public final List materialOverrides;
    public final boolean modelCastShadows;
    public final int modelColor;
    public final String modelColorExpression;
    public final float modelColorMixIntensity;
    public final String modelColorMixIntensityExpression;
    public final String modelColorUseTheme;
    public final String modelColorUseThemeExpression;
    public final ModelElevationReference modelElevationReference;
    public final float modelEmissiveStrength;
    public final String modelEmissiveStrengthExpression;
    public final float modelOpacity;
    public final String modelOpacityExpression;
    public final boolean modelReceiveShadows;
    public final List modelRotation;
    public final String modelRotationExpression;
    public final List modelScale;
    public final String modelScaleExpression;
    public final ModelScaleMode modelScaleMode;
    public final List modelTranslation;
    public final String modelUri;
    public final List nodeOverrides;
    public final List position;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getModelScaleExpression() {
        return this.modelScaleExpression;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    public final int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.modelScale, af$$ExternalSyntheticOutline1.m(this.modelOpacity, c8$$ExternalSyntheticOutline0.m(this.position, this.modelUri.hashCode() * 31, 31), 31), 31);
        String str = this.modelScaleExpression;
        int iM2 = c8$$ExternalSyntheticOutline0.m(this.modelRotation, c8$$ExternalSyntheticOutline0.m(this.modelTranslation, (iM + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        boolean z = this.modelCastShadows;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        boolean z2 = this.modelReceiveShadows;
        int iM3 = af$$ExternalSyntheticOutline1.m(this.modelEmissiveStrength, (this.modelScaleMode.hashCode() + ((((iM2 + r1) * 31) + (z2 ? 1 : z2)) * 31)) * 31, 31);
        String str2 = this.modelEmissiveStrengthExpression;
        int iHashCode = str2 == null ? 0 : str2.hashCode();
        String str3 = this.modelOpacityExpression;
        int iHashCode2 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.modelRotationExpression;
        int iM4 = af$$ExternalSyntheticOutline0.m(this.modelColor, (((((iM3 + iHashCode) * 31) + iHashCode2) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.modelColorExpression;
        int iM5 = af$$ExternalSyntheticOutline1.m(this.modelColorMixIntensity, (iM4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.modelColorMixIntensityExpression;
        int iM6 = af$$ExternalSyntheticOutline0.m((this.modelElevationReference.hashCode() + c8$$ExternalSyntheticOutline0.m(this.nodeOverrides, c8$$ExternalSyntheticOutline0.m(this.materialOverrides, (iM5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31)) * 31, 31, this.modelColorUseTheme);
        String str7 = this.modelColorUseThemeExpression;
        return iM6 + (str7 != null ? str7.hashCode() : 0);
    }

    public LocationPuck3D(String str, List list, float f, List list2, String str2, List list3, List list4, boolean z, boolean z2, ModelScaleMode modelScaleMode, float f2, String str3, String str4, String str5, int i, String str6, float f3, String str7, List list5, List list6, ModelElevationReference modelElevationReference, String str8, String str9) {
        str.getClass();
        modelScaleMode.getClass();
        list5.getClass();
        list6.getClass();
        modelElevationReference.getClass();
        str8.getClass();
        this.modelUri = str;
        this.position = list;
        this.modelOpacity = f;
        this.modelScale = list2;
        this.modelScaleExpression = str2;
        this.modelTranslation = list3;
        this.modelRotation = list4;
        this.modelCastShadows = z;
        this.modelReceiveShadows = z2;
        this.modelScaleMode = modelScaleMode;
        this.modelEmissiveStrength = f2;
        this.modelEmissiveStrengthExpression = str3;
        this.modelOpacityExpression = str4;
        this.modelRotationExpression = str5;
        this.modelColor = i;
        this.modelColorExpression = str6;
        this.modelColorMixIntensity = f3;
        this.modelColorMixIntensityExpression = str7;
        this.materialOverrides = list5;
        this.nodeOverrides = list6;
        this.modelElevationReference = modelElevationReference;
        this.modelColorUseTheme = str8;
        this.modelColorUseThemeExpression = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.modelUri);
        List list = this.position;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeFloat(((Number) it.next()).floatValue());
        }
        parcel.writeFloat(this.modelOpacity);
        List list2 = this.modelScale;
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeFloat(((Number) it2.next()).floatValue());
        }
        parcel.writeString(this.modelScaleExpression);
        List list3 = this.modelTranslation;
        parcel.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            parcel.writeFloat(((Number) it3.next()).floatValue());
        }
        List list4 = this.modelRotation;
        parcel.writeInt(list4.size());
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            parcel.writeFloat(((Number) it4.next()).floatValue());
        }
        parcel.writeInt(this.modelCastShadows ? 1 : 0);
        parcel.writeInt(this.modelReceiveShadows ? 1 : 0);
        parcel.writeString(this.modelScaleMode.name());
        parcel.writeFloat(this.modelEmissiveStrength);
        parcel.writeString(this.modelEmissiveStrengthExpression);
        parcel.writeString(this.modelOpacityExpression);
        parcel.writeString(this.modelRotationExpression);
        parcel.writeInt(this.modelColor);
        parcel.writeString(this.modelColorExpression);
        parcel.writeFloat(this.modelColorMixIntensity);
        parcel.writeString(this.modelColorMixIntensityExpression);
        parcel.writeStringList(this.materialOverrides);
        parcel.writeStringList(this.nodeOverrides);
        parcel.writeString(this.modelElevationReference.name());
        parcel.writeString(this.modelColorUseTheme);
        parcel.writeString(this.modelColorUseThemeExpression);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationPuck3D)) {
            return false;
        }
        LocationPuck3D locationPuck3D = (LocationPuck3D) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modelUri, locationPuck3D.modelUri}, getCieXyz.write())).booleanValue() || !this.position.equals(locationPuck3D.position) || Float.compare(this.modelOpacity, locationPuck3D.modelOpacity) != 0 || !this.modelScale.equals(locationPuck3D.modelScale)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modelScaleExpression, locationPuck3D.modelScaleExpression}, getCieXyz.write())).booleanValue() || !this.modelTranslation.equals(locationPuck3D.modelTranslation) || !this.modelRotation.equals(locationPuck3D.modelRotation) || this.modelCastShadows != locationPuck3D.modelCastShadows || this.modelReceiveShadows != locationPuck3D.modelReceiveShadows || this.modelScaleMode != locationPuck3D.modelScaleMode || Float.compare(this.modelEmissiveStrength, locationPuck3D.modelEmissiveStrength) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modelEmissiveStrengthExpression, locationPuck3D.modelEmissiveStrengthExpression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modelOpacityExpression, locationPuck3D.modelOpacityExpression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modelRotationExpression, locationPuck3D.modelRotationExpression}, getCieXyz.write())).booleanValue() || this.modelColor != locationPuck3D.modelColor) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modelColorExpression, locationPuck3D.modelColorExpression}, getCieXyz.write())).booleanValue() || Float.compare(this.modelColorMixIntensity, locationPuck3D.modelColorMixIntensity) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modelColorMixIntensityExpression, locationPuck3D.modelColorMixIntensityExpression}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.materialOverrides, locationPuck3D.materialOverrides}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.nodeOverrides, locationPuck3D.nodeOverrides}, getCieXyz.write())).booleanValue() || this.modelElevationReference != locationPuck3D.modelElevationReference) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modelColorUseTheme, locationPuck3D.modelColorUseTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.modelColorUseThemeExpression, locationPuck3D.modelColorUseThemeExpression}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationPuck3D(modelUri=");
        sb.append(this.modelUri);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", modelOpacity=");
        sb.append(this.modelOpacity);
        sb.append(", modelScale=");
        sb.append(this.modelScale);
        sb.append(", modelScaleExpression=");
        sb.append(this.modelScaleExpression);
        sb.append(", modelTranslation=");
        sb.append(this.modelTranslation);
        sb.append(", modelRotation=");
        sb.append(this.modelRotation);
        sb.append(", modelCastShadows=");
        sb.append(this.modelCastShadows);
        sb.append(", modelReceiveShadows=");
        sb.append(this.modelReceiveShadows);
        sb.append(", modelScaleMode=");
        sb.append(this.modelScaleMode);
        sb.append(", modelEmissiveStrength=");
        sb.append(this.modelEmissiveStrength);
        sb.append(", modelEmissiveStrengthExpression=");
        sb.append(this.modelEmissiveStrengthExpression);
        sb.append(", modelOpacityExpression=");
        sb.append(this.modelOpacityExpression);
        sb.append(", modelRotationExpression=");
        sb.append(this.modelRotationExpression);
        sb.append(", modelColor=");
        sb.append(this.modelColor);
        sb.append(", modelColorExpression=");
        sb.append(this.modelColorExpression);
        sb.append(", modelColorMixIntensity=");
        sb.append(this.modelColorMixIntensity);
        sb.append(", modelColorMixIntensityExpression=");
        sb.append(this.modelColorMixIntensityExpression);
        sb.append(", materialOverrides=");
        sb.append(this.materialOverrides);
        sb.append(", nodeOverrides=");
        sb.append(this.nodeOverrides);
        sb.append(", modelElevationReference=");
        sb.append(this.modelElevationReference);
        sb.append(", modelColorUseTheme=");
        sb.append(this.modelColorUseTheme);
        sb.append(", modelColorUseThemeExpression=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.modelColorUseThemeExpression, ')');
    }
}
