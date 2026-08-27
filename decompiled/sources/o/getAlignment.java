package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class getAlignment extends PainterElement {
    @Override // o.toDpu2uoSUM, o.accesstoSizeXkaWNTQjd, o.toPx0680j_4, o.InnerShadowScope
    public final void read() {
        drawBehind drawbehind;
        ArrayList arrayList = this.getDefaultViewModelProviderFactory;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            drawbehind = this.getLastCustomNonConfigurationInstance;
            if (!zHasNext) {
                break;
            } else {
                drawbehind.write(it.next()).serializer();
            }
        }
        accesstoSizeXkaWNTQjd accesstosizexkawntqjd = null;
        accesstoSizeXkaWNTQjd accesstosizexkawntqjd2 = null;
        for (Object obj : arrayList) {
            accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite = drawbehind.write(obj);
            if (accesstosizexkawntqjd2 == null) {
                Object obj2 = this.addOnMultiWindowModeChangedListener;
                if (obj2 != null) {
                    accesstosizexkawntqjdWrite.read(obj2);
                    accesstosizexkawntqjdWrite.serializer(this.addObserverForBackInvoker).write(this.createFullyDrawnExecutor);
                } else {
                    Object obj3 = this.addOnContextAvailableListener;
                    if (obj3 != null) {
                        accesstosizexkawntqjdWrite.getClass();
                        accesstosizexkawntqjdWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.TOP_TO_BOTTOM;
                        accesstosizexkawntqjdWrite.addOnContextAvailableListener = obj3;
                        accesstosizexkawntqjdWrite.serializer(this.addObserverForBackInvoker).write(this.createFullyDrawnExecutor);
                    } else {
                        String string = accesstosizexkawntqjdWrite.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.toString();
                        accesstosizexkawntqjdWrite.read((Object) 0);
                        accesstosizexkawntqjdWrite.IconCompatParcelizer(Float.valueOf(write(string))).read(Float.valueOf(serializer(string)));
                    }
                }
                accesstosizexkawntqjd2 = accesstosizexkawntqjdWrite;
            }
            if (accesstosizexkawntqjd != null) {
                String string2 = accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.toString();
                String string3 = accesstosizexkawntqjdWrite.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.toString();
                Object obj4 = accesstosizexkawntqjdWrite.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.BOTTOM_TO_TOP;
                accesstosizexkawntqjd.MediaMetadataCompat = obj4;
                accesstosizexkawntqjd.IconCompatParcelizer(Float.valueOf(IconCompatParcelizer(string2))).read(Float.valueOf(RemoteActionCompatParcelizer(string2)));
                Object obj5 = accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                accesstosizexkawntqjdWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.TOP_TO_BOTTOM;
                accesstosizexkawntqjdWrite.addOnContextAvailableListener = obj5;
                accesstosizexkawntqjdWrite.IconCompatParcelizer(Float.valueOf(write(string3))).read(Float.valueOf(serializer(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.invalidateMenu;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                accesstosizexkawntqjdWrite.addOnTrimMemoryListener = fFloatValue;
            }
            accesstosizexkawntqjd = accesstosizexkawntqjdWrite;
        }
        if (accesstosizexkawntqjd != null) {
            Object obj6 = this.MediaMetadataCompat;
            if (obj6 != null) {
                accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.BOTTOM_TO_TOP;
                accesstosizexkawntqjd.MediaMetadataCompat = obj6;
                accesstosizexkawntqjd.serializer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28).write(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
            } else {
                Object obj7 = this.MediaSessionCompatQueueItem;
                if (obj7 != null) {
                    accesstosizexkawntqjd.serializer(obj7);
                    accesstosizexkawntqjd.serializer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28).write(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
                } else {
                    String string5 = accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.toString();
                    accesstosizexkawntqjd.serializer((Object) 0);
                    accesstosizexkawntqjd.IconCompatParcelizer(Float.valueOf(IconCompatParcelizer(string5))).read(Float.valueOf(RemoteActionCompatParcelizer(string5)));
                }
            }
        }
        if (accesstosizexkawntqjd2 == null) {
            return;
        }
        float f = this.getViewModelStore;
        if (f != 0.5f) {
            accesstosizexkawntqjd2.enterPictureInPictureMode = f;
        }
        int i = getPainter.write[this.onConfigurationChanged.ordinal()];
        if (i == 1) {
            accesstosizexkawntqjd2.addOnPictureInPictureModeChangedListener = 0;
        } else if (i == 2) {
            accesstosizexkawntqjd2.addOnPictureInPictureModeChangedListener = 1;
        } else {
            if (i != 3) {
                return;
            }
            accesstosizexkawntqjd2.addOnPictureInPictureModeChangedListener = 2;
        }
    }

    public getAlignment(drawBehind drawbehind, toRect torect) {
        super(drawbehind, torect);
    }
}
