package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class EmptyBuildDrawCacheParams extends toDpu2uoSUM {
    public float getLifecycle;
    public final /* synthetic */ int getViewModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmptyBuildDrawCacheParams(drawBehind drawbehind, toRect torect, int i) {
        super(drawbehind, torect);
        this.getViewModelStore = i;
    }

    @Override // o.toDpu2uoSUM, o.accesstoSizeXkaWNTQjd, o.toPx0680j_4, o.InnerShadowScope
    public final void read() {
        int i = this.getViewModelStore;
        drawBehind drawbehind = this.getLastCustomNonConfigurationInstance;
        ArrayList arrayList = this.getDefaultViewModelProviderFactory;
        if (i != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite = drawbehind.write(it.next());
                accesstosizexkawntqjdWrite.IconCompatParcelizer();
                Object obj = this.onBackPressedDispatcher_delegatelambda00;
                if (obj != null) {
                    accesstosizexkawntqjdWrite.write(obj);
                } else {
                    Object obj2 = this.addContentView;
                    if (obj2 != null) {
                        accesstosizexkawntqjdWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.START_TO_END;
                        accesstosizexkawntqjdWrite.addContentView = obj2;
                    } else {
                        accesstosizexkawntqjdWrite.write((Object) 0);
                    }
                }
                Object obj3 = this.PlaybackStateCompat;
                if (obj3 != null) {
                    accesstosizexkawntqjdWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.END_TO_START;
                    accesstosizexkawntqjdWrite.PlaybackStateCompat = obj3;
                } else {
                    Object obj4 = this.PlaybackStateCompatCustomAction;
                    if (obj4 != null) {
                        accesstosizexkawntqjdWrite.IconCompatParcelizer(obj4);
                    } else {
                        accesstosizexkawntqjdWrite.IconCompatParcelizer((Object) 0);
                    }
                }
                float f = this.getLifecycle;
                if (f != 0.5f) {
                    accesstosizexkawntqjdWrite.ResultReceiver = f;
                }
            }
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite2 = drawbehind.write(it2.next());
            accesstosizexkawntqjdWrite2.serializer();
            Object obj5 = this.addOnMultiWindowModeChangedListener;
            if (obj5 != null) {
                accesstosizexkawntqjdWrite2.read(obj5);
            } else {
                Object obj6 = this.addOnContextAvailableListener;
                if (obj6 != null) {
                    accesstosizexkawntqjdWrite2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.TOP_TO_BOTTOM;
                    accesstosizexkawntqjdWrite2.addOnContextAvailableListener = obj6;
                } else {
                    accesstosizexkawntqjdWrite2.read((Object) 0);
                }
            }
            Object obj7 = this.MediaMetadataCompat;
            if (obj7 != null) {
                accesstosizexkawntqjdWrite2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.BOTTOM_TO_TOP;
                accesstosizexkawntqjdWrite2.MediaMetadataCompat = obj7;
            } else {
                Object obj8 = this.MediaSessionCompatQueueItem;
                if (obj8 != null) {
                    accesstosizexkawntqjdWrite2.serializer(obj8);
                } else {
                    accesstosizexkawntqjdWrite2.serializer((Object) 0);
                }
            }
            float f2 = this.getLifecycle;
            if (f2 != 0.5f) {
                accesstosizexkawntqjdWrite2.enterPictureInPictureMode = f2;
            }
        }
    }
}
