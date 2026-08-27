package androidx.compose.ui.adaptive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import android.os.Handler;
import android.os.Looper;
import android.view.InputDevice;
import android.view.View;
import androidx.compose.ui.UiMediaScope;
import androidx.compose.ui.platform.WindowInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o.AndroidContentCaptureManager;
import o.FocusListener;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.GraphicsLayerElement;
import o.component11SzJe1aQ;
import o.component160d7_KjU;
import o.findFocusTargetui;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPersonMiddleInitial;
import o.getPersonNamePrefix;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toCompareValue;

/* JADX INFO: loaded from: classes.dex */
public final class MediaQuery_androidKt {
    private static final boolean hasSource(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutomotiveDevice(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.type.automotive");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCameraAvailable(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.camera.any");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMicAvailable(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.microphone");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTvDevice(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.software.leanback");
    }

    public static final UiMediaScope obtainUiMediaScope(final Context context, View view, WindowInfo windowInfo, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            Object systemService = context.getSystemService("input");
            systemService.getClass();
            objComponentActivity = (InputManager) systemService;
            getpostalcode.write(objComponentActivity);
        }
        final InputManager inputManager = (InputManager) objComponentActivity;
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        if (objComponentActivity2 == androidContentCaptureManager) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            objComponentActivity2 = Boolean.valueOf(isImeVisible(findFocusTargetui.read(view)));
            getpostalcode.write(objComponentActivity2);
        }
        boolean zBooleanValue = ((Boolean) objComponentActivity2).booleanValue();
        Object objComponentActivity3 = getpostalcode.ComponentActivity();
        if (objComponentActivity3 == androidContentCaptureManager) {
            objComponentActivity3 = new UiMediaScopeImpl(context, inputManager, windowInfo, zBooleanValue);
            getpostalcode.write(objComponentActivity3);
        }
        final UiMediaScopeImpl uiMediaScopeImpl = (UiMediaScopeImpl) objComponentActivity3;
        uiMediaScopeImpl.set_windowInfo(windowInfo);
        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(context);
        Object objComponentActivity4 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer || objComponentActivity4 == androidContentCaptureManager) {
            objComponentActivity4 = new MediaQuery_androidKt$obtainUiMediaScope$1$1(context, uiMediaScopeImpl, null);
            getpostalcode.write(objComponentActivity4);
        }
        getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, context, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(inputManager);
        Object objComponentActivity5 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer2 || objComponentActivity5 == androidContentCaptureManager) {
            objComponentActivity5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [android.hardware.input.InputManager$InputDeviceListener, androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1$listener$1] */
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                    final UiMediaScopeImpl uiMediaScopeImpl2 = uiMediaScopeImpl;
                    final InputManager inputManager2 = inputManager;
                    final ?? r1 = new InputManager.InputDeviceListener() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1$listener$1
                        @Override // android.hardware.input.InputManager.InputDeviceListener
                        public void onInputDeviceAdded(int i2) {
                            update();
                        }

                        @Override // android.hardware.input.InputManager.InputDeviceListener
                        public void onInputDeviceChanged(int i2) {
                            update();
                        }

                        @Override // android.hardware.input.InputManager.InputDeviceListener
                        public void onInputDeviceRemoved(int i2) {
                            update();
                        }

                        public final void update() {
                            uiMediaScopeImpl2.m211set_anyPointerZYK4Wgo(MediaQuery_androidKt.resolvePointerPrecision(inputManager2));
                            uiMediaScopeImpl2.setHasPhysicalKeyboard(MediaQuery_androidKt.hasPhysicalKeyboard(inputManager2));
                        }
                    };
                    inputManager.registerInputDeviceListener(r1, new Handler(Looper.getMainLooper()));
                    r1.update();
                    final InputManager inputManager3 = inputManager;
                    return new getPersonMiddleInitial() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$2$1$invoke$$inlined$onDispose$1
                        @Override // o.getPersonMiddleInitial
                        public void dispose() {
                            inputManager3.unregisterInputDeviceListener(r1);
                        }
                    };
                }
            };
            getpostalcode.write(objComponentActivity5);
        }
        getPhoneNumberNational.serializer(context, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode);
        boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(view);
        Object objComponentActivity6 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer3 || objComponentActivity6 == androidContentCaptureManager) {
            objComponentActivity6 = new MediaQuery_androidKt$obtainUiMediaScope$3$1(view, uiMediaScopeImpl);
            getpostalcode.write(objComponentActivity6);
        }
        getPhoneNumberNational.serializer(view, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, getpostalcode);
        boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(context);
        Object objComponentActivity7 = getpostalcode.ComponentActivity();
        if (zIconCompatParcelizer4 || objComponentActivity7 == androidContentCaptureManager) {
            objComponentActivity7 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [android.content.BroadcastReceiver, androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1] */
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.DOCK_EVENT");
                    final UiMediaScopeImpl uiMediaScopeImpl2 = uiMediaScopeImpl;
                    final ?? r1 = new BroadcastReceiver() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$receiver$1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context2, Intent intent) {
                            uiMediaScopeImpl2.setDocked(MediaQuery_androidKt.isDocked(intent));
                        }
                    };
                    uiMediaScopeImpl.setDocked(MediaQuery_androidKt.isDocked(FocusListener.read(context, r1, intentFilter, null, 2)));
                    final Context context2 = context;
                    return new getPersonMiddleInitial() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$4$1$invoke$$inlined$onDispose$1
                        @Override // o.getPersonMiddleInitial
                        public void dispose() {
                            context2.unregisterReceiver(r1);
                        }
                    };
                }
            };
            getpostalcode.write(objComponentActivity7);
        }
        getPhoneNumberNational.serializer(context, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7, getpostalcode);
        return uiMediaScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolvePointerPrecision(InputManager inputManager) {
        if (inputManager == null) {
            return UiMediaScope.PointerPrecision.Companion.m188getNonefpxItnM();
        }
        String strM188getNonefpxItnM = UiMediaScope.PointerPrecision.Companion.m188getNonefpxItnM();
        for (int i : inputManager.getInputDeviceIds()) {
            InputDevice inputDevice = inputManager.getInputDevice(i);
            if (inputDevice != null) {
                if (hasValidPointerSource$default(inputDevice, 8194, 0, 2, null) || hasValidPointerSource$default(inputDevice, 16386, 0, 2, null) || hasValidPointerSource$default(inputDevice, 1048584, 0, 2, null)) {
                    return UiMediaScope.PointerPrecision.Companion.m187getFinefpxItnM();
                }
                if (hasValidPointerSource$default(inputDevice, 4098, 0, 2, null)) {
                    strM188getNonefpxItnM = UiMediaScope.PointerPrecision.Companion.m186getCoarsefpxItnM();
                } else {
                    UiMediaScope.PointerPrecision.Companion companion = UiMediaScope.PointerPrecision.Companion;
                    if (UiMediaScope.PointerPrecision.m181equalsimpl0(strM188getNonefpxItnM, companion.m188getNonefpxItnM()) && (hasValidPointerSource$default(inputDevice, 16777232, 0, 2, null) || hasValidPointerSource$default(inputDevice, 1025, 0, 2, null))) {
                        strM188getNonefpxItnM = companion.m185getBluntfpxItnM();
                    }
                }
            }
        }
        return strM188getNonefpxItnM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolvePosture(component160d7_KjU component160d7_kju) {
        Object next;
        component11SzJe1aQ component11szje1aq = component11SzJe1aQ.IconCompatParcelizer;
        List list = component160d7_kju.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof GraphicsLayerElement) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((GraphicsLayerElement) next).IconCompatParcelizer != component11SzJe1aQ.RemoteActionCompatParcelizer);
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) next;
        if (graphicsLayerElement == null) {
            return UiMediaScope.Posture.Companion.m197getFlatm18o9QQ();
        }
        toCompareValue tocomparevalue = graphicsLayerElement.RemoteActionCompatParcelizer;
        return (tocomparevalue.serializer() > tocomparevalue.read() ? component11szje1aq : component11SzJe1aQ.RatingCompat) != component11szje1aq ? UiMediaScope.Posture.Companion.m196getBookm18o9QQ() : UiMediaScope.Posture.Companion.m198getTabletopm18o9QQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasPhysicalKeyboard(InputManager inputManager) {
        int[] inputDeviceIds;
        if (inputManager != null && (inputDeviceIds = inputManager.getInputDeviceIds()) != null) {
            for (int i : inputDeviceIds) {
                InputDevice inputDevice = inputManager.getInputDevice(i);
                if (inputDevice != null && inputDevice.getKeyboardType() == 2 && !inputDevice.isVirtual()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean hasValidPointerSource$default(InputDevice inputDevice, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return hasValidPointerSource(inputDevice, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isImeVisible(FocusRequesterModifierKt focusRequesterModifierKt) {
        return focusRequesterModifierKt != null && focusRequesterModifierKt.IconCompatParcelizer.isVisible(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDocked(Intent intent) {
        return (intent == null || intent.getIntExtra("android.intent.extra.DOCK_STATE", 0) == 0) ? false : true;
    }

    private static final boolean hasValidPointerSource(InputDevice inputDevice, int i, int i2) {
        return (inputDevice.getSources() & i) == i && inputDevice.getMotionRange(i2, i) != null;
    }
}
