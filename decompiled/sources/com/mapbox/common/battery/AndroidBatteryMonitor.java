package com.mapbox.common.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.incognia.internal.ZM$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.BatteryChargingStatusCallback;
import com.mapbox.common.BatteryMonitorInterface;
import com.mapbox.common.BatteryMonitorObserver;
import com.mapbox.common.MapboxSDKCommon;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.FocusListener;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidBatteryMonitor implements BatteryMonitorInterface {
    private static final int BATTERY_STATUS_UNPLUGGED = 0;
    public static final Companion Companion = new Companion(null);
    private static final String NO_BATTERY_INFO_ERROR = "Unknown battery status";
    private final BroadcastReceiver broadcastReceiver;
    private Expected<String, Boolean> chargingState;
    private final Context context;
    private final IntentFilter intentFilter;
    private final Map<BatteryMonitorObserver, Handler> observers;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final BatteryMonitorInterface create() {
            return new AndroidBatteryMonitor(MapboxSDKCommon.INSTANCE.getContext(), null, 2, 0 == true ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void notify(final BatteryMonitorObserver batteryMonitorObserver, Expected<String, Boolean> expected) {
            final int i = 0;
            Expected<String, Boolean> expectedOnValue = expected.onValue(new Expected.Action() { // from class: com.mapbox.common.battery.AndroidBatteryMonitor$Companion$$ExternalSyntheticLambda0
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    if (i != 0) {
                        AndroidBatteryMonitor.Companion.notify$lambda$1(batteryMonitorObserver, (String) obj);
                    } else {
                        AndroidBatteryMonitor.Companion.notify$lambda$0(batteryMonitorObserver, ((Boolean) obj).booleanValue());
                    }
                }
            });
            final int i2 = 1;
            expectedOnValue.onError(new Expected.Action() { // from class: com.mapbox.common.battery.AndroidBatteryMonitor$Companion$$ExternalSyntheticLambda0
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    if (i2 != 0) {
                        AndroidBatteryMonitor.Companion.notify$lambda$1(batteryMonitorObserver, (String) obj);
                    } else {
                        AndroidBatteryMonitor.Companion.notify$lambda$0(batteryMonitorObserver, ((Boolean) obj).booleanValue());
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void notify$lambda$0(BatteryMonitorObserver batteryMonitorObserver, boolean z) {
            batteryMonitorObserver.getClass();
            batteryMonitorObserver.onBatteryChargingStatusChanged(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void notify$lambda$1(BatteryMonitorObserver batteryMonitorObserver, String str) {
            batteryMonitorObserver.getClass();
            str.getClass();
            batteryMonitorObserver.onBatteryStatusError(str);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Expected<String, Boolean> getState(Intent intent) {
            if (intent != null && intent.hasExtra("plugged")) {
                Expected<String, Boolean> expectedCreateValue = ExpectedFactory.createValue(Boolean.valueOf(intent.getIntExtra("plugged", -1) != 0));
                expectedCreateValue.getClass();
                return expectedCreateValue;
            }
            Expected<String, Boolean> expectedCreateError = ExpectedFactory.createError(AndroidBatteryMonitor.NO_BATTERY_INFO_ERROR);
            expectedCreateError.getClass();
            return expectedCreateError;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean equals(Expected<?, ?> expected, Expected<?, ?> expected2) {
            if (expected != null && expected2 != null) {
                if (expected.isValue()) {
                    if (!expected2.isValue()) {
                        return false;
                    }
                    Object[] objArr = {expected.getValue(), expected2.getValue()};
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
                }
                if (!expected2.isError()) {
                    return false;
                }
                Object[] objArr2 = {expected.getError(), expected2.getError()};
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue();
            }
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{expected, expected2}, iWrite3)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewIntent(Intent intent) {
        synchronized (this) {
            Companion companion = Companion;
            Expected<String, Boolean> state = companion.getState(intent);
            if (!companion.equals(state, this.chargingState)) {
                this.chargingState = state;
                notifyObservers(state);
            }
        }
    }

    @Override // com.mapbox.common.BatteryMonitorInterface
    public void getBatteryChargingStatus(BatteryChargingStatusCallback batteryChargingStatusCallback) {
        synchronized (this) {
            batteryChargingStatusCallback.getClass();
            batteryChargingStatusCallback.run(Companion.getState(this.context.registerReceiver(null, this.intentFilter)));
        }
    }

    @Override // com.mapbox.common.BatteryMonitorInterface
    public void registerObserver(BatteryMonitorObserver batteryMonitorObserver) {
        synchronized (this) {
            batteryMonitorObserver.getClass();
            Map<BatteryMonitorObserver, Handler> map = this.observers;
            Looper looperMyLooper = Looper.myLooper();
            map.put(batteryMonitorObserver, looperMyLooper != null ? new Handler(looperMyLooper) : null);
            if (this.observers.size() == 1) {
                FocusListener.read(this.context, this.broadcastReceiver, this.intentFilter, null, 4);
            }
        }
    }

    @Override // com.mapbox.common.BatteryMonitorInterface
    public void unregisterObserver(BatteryMonitorObserver batteryMonitorObserver) {
        synchronized (this) {
            batteryMonitorObserver.getClass();
            this.observers.remove(batteryMonitorObserver);
            if (this.observers.isEmpty()) {
                this.context.unregisterReceiver(this.broadcastReceiver);
            }
        }
    }

    public static final BatteryMonitorInterface create() {
        return Companion.create();
    }

    private final void notifyObservers(Expected<String, Boolean> expected) {
        for (Map.Entry<BatteryMonitorObserver, Handler> entry : this.observers.entrySet()) {
            BatteryMonitorObserver key = entry.getKey();
            Handler value = entry.getValue();
            if (value != null) {
                value.post(new ZM$$ExternalSyntheticLambda0(key, 3, expected));
            } else {
                Companion.notify(key, expected);
            }
        }
    }

    public AndroidBatteryMonitor(Context context, String str) {
        context.getClass();
        str.getClass();
        this.context = context;
        this.observers = new LinkedHashMap();
        this.intentFilter = new IntentFilter(str);
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.mapbox.common.battery.AndroidBatteryMonitor$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                context2.getClass();
                intent.getClass();
                this.this$0.onNewIntent(intent);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$2$lambda$1(BatteryMonitorObserver batteryMonitorObserver, Expected expected) {
        batteryMonitorObserver.getClass();
        expected.getClass();
        Companion.notify(batteryMonitorObserver, expected);
    }

    public /* synthetic */ AndroidBatteryMonitor(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? "android.intent.action.BATTERY_CHANGED" : str);
    }
}
