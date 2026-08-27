package com.braze.ui.inappmessage.views;

import com.braze.enums.inappmessage.CropType;

/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageImageView {
    void setAltImageText(String str);

    void setAspectRatio(float f);

    void setCornersRadiiPx(float f, float f2, float f3, float f4);

    void setCornersRadiusPx(float f);

    void setInAppMessageImageCropType(CropType cropType);

    void setToHalfParentHeight(boolean z);
}
