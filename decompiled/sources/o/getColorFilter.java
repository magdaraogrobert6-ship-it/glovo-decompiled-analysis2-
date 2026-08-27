package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class getColorFilter extends PainterElement {
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
                drawbehind.write(it.next()).IconCompatParcelizer();
            }
        }
        accesstoSizeXkaWNTQjd accesstosizexkawntqjd = null;
        accesstoSizeXkaWNTQjd accesstosizexkawntqjd2 = null;
        for (Object obj : arrayList) {
            accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite = drawbehind.write(obj);
            if (accesstosizexkawntqjd2 == null) {
                Object obj2 = this.onBackPressedDispatcher_delegatelambda00;
                if (obj2 != null) {
                    accesstosizexkawntqjdWrite.write(obj2);
                    accesstosizexkawntqjdWrite.serializer(this._init_lambda3).write(this.ensureViewModelStore);
                } else {
                    Object obj3 = this.addContentView;
                    if (obj3 != null) {
                        accesstosizexkawntqjdWrite.getClass();
                        accesstosizexkawntqjdWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.START_TO_END;
                        accesstosizexkawntqjdWrite.addContentView = obj3;
                        accesstosizexkawntqjdWrite.serializer(this._init_lambda3).write(this.ensureViewModelStore);
                    } else {
                        Object obj4 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                        if (obj4 != null) {
                            accesstosizexkawntqjdWrite.write(obj4);
                            accesstosizexkawntqjdWrite.serializer(this._init_lambda4).write(this._init_lambda1);
                        } else {
                            Object obj5 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            if (obj5 != null) {
                                accesstosizexkawntqjdWrite.getClass();
                                accesstosizexkawntqjdWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.START_TO_END;
                                accesstosizexkawntqjdWrite.addContentView = obj5;
                                accesstosizexkawntqjdWrite.serializer(this._init_lambda4).write(this._init_lambda1);
                            } else {
                                String string = accesstosizexkawntqjdWrite.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.toString();
                                accesstosizexkawntqjdWrite.write((Object) 0);
                                accesstosizexkawntqjdWrite.IconCompatParcelizer(Float.valueOf(write(string))).read(Float.valueOf(serializer(string)));
                            }
                        }
                    }
                }
                accesstosizexkawntqjd2 = accesstosizexkawntqjdWrite;
            }
            if (accesstosizexkawntqjd != null) {
                String string2 = accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.toString();
                String string3 = accesstosizexkawntqjdWrite.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.toString();
                Object obj6 = accesstosizexkawntqjdWrite.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.END_TO_START;
                accesstosizexkawntqjd.PlaybackStateCompat = obj6;
                accesstosizexkawntqjd.IconCompatParcelizer(Float.valueOf(IconCompatParcelizer(string2))).read(Float.valueOf(RemoteActionCompatParcelizer(string2)));
                Object obj7 = accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                accesstosizexkawntqjdWrite.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.START_TO_END;
                accesstosizexkawntqjdWrite.addContentView = obj7;
                accesstosizexkawntqjdWrite.IconCompatParcelizer(Float.valueOf(write(string3))).read(Float.valueOf(serializer(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.invalidateMenu;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                accesstosizexkawntqjdWrite.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = fFloatValue;
            }
            accesstosizexkawntqjd = accesstosizexkawntqjdWrite;
        }
        if (accesstosizexkawntqjd != null) {
            Object obj8 = this.PlaybackStateCompat;
            if (obj8 != null) {
                accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.END_TO_START;
                accesstosizexkawntqjd.PlaybackStateCompat = obj8;
                accesstosizexkawntqjd.serializer(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw).write(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
            } else {
                Object obj9 = this.PlaybackStateCompatCustomAction;
                if (obj9 != null) {
                    accesstosizexkawntqjd.IconCompatParcelizer(obj9);
                    accesstosizexkawntqjd.serializer(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw).write(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                } else {
                    Object obj10 = this.getSavedStateRegistryControllerannotations;
                    if (obj10 != null) {
                        accesstosizexkawntqjd.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = toDpGaN1DYA.END_TO_START;
                        accesstosizexkawntqjd.PlaybackStateCompat = obj10;
                        accesstosizexkawntqjd.serializer(this._init_lambda2).write(this.accessensureViewModelStore);
                    } else {
                        Object obj11 = this.fullyDrawnReporter_delegatelambda00;
                        if (obj11 != null) {
                            accesstosizexkawntqjd.IconCompatParcelizer(obj11);
                            accesstosizexkawntqjd.serializer(this._init_lambda2).write(this.accessensureViewModelStore);
                        } else {
                            String string5 = accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.toString();
                            accesstosizexkawntqjd.IconCompatParcelizer((Object) 0);
                            accesstosizexkawntqjd.IconCompatParcelizer(Float.valueOf(IconCompatParcelizer(string5))).read(Float.valueOf(RemoteActionCompatParcelizer(string5)));
                        }
                    }
                }
            }
        }
        if (accesstosizexkawntqjd2 == null) {
            return;
        }
        float f = this.getViewModelStore;
        if (f != 0.5f) {
            accesstosizexkawntqjd2.ResultReceiver = f;
        }
        int i = getSizeToIntrinsics.write[this.onConfigurationChanged.ordinal()];
        if (i == 1) {
            accesstosizexkawntqjd2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
        } else if (i == 2) {
            accesstosizexkawntqjd2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
        } else {
            if (i != 3) {
                return;
            }
            accesstosizexkawntqjd2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 2;
        }
    }

    public getColorFilter(drawBehind drawbehind, toRect torect) {
        super(drawbehind, torect);
    }
}
