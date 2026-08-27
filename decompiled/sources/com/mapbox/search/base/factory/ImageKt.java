package com.mapbox.search.base.factory;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.search.common.metadata.ImageInfo;
import com.mapbox.search.internal.bindgen.ImageCategory;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImageKt {
    public static final ImageInfo mapToPlatform(com.mapbox.search.internal.bindgen.ImageInfo imageInfo) {
        String str;
        String url = imageInfo.getUrl();
        url.getClass();
        int width = imageInfo.getWidth();
        int height = imageInfo.getHeight();
        String thumbnail = imageInfo.getThumbnail();
        ImageCategory category = imageInfo.getCategory();
        String str2 = null;
        if (category != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[category.ordinal()]) {
                case 1:
                    str = "EV_CHARGER";
                    break;
                case 2:
                    str = "ENTRANCE";
                    break;
                case 3:
                    str = "LOCATION";
                    break;
                case 4:
                    str = "EV_NETWORK";
                    break;
                case 5:
                    str = "EV_OPERATOR";
                    break;
                case 6:
                    str = "OTHER";
                    break;
                case 7:
                    str = "EV_OWNER";
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
            }
            str2 = str;
        }
        return new ImageInfo(url, width, height, thumbnail, str2, imageInfo.getType());
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCategory.values().length];
            try {
                iArr[ImageCategory.CHARGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCategory.ENTRANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCategory.LOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageCategory.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageCategory.OPERATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageCategory.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageCategory.OWNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
