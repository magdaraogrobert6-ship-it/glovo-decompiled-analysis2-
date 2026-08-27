package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import java.util.HashMap;
import o.accessgetTwocp;
import o.getPageDownEK5gGoQ;
import o.getProfileSwitchEK5gGoQ;
import o.getProgramGreenEK5gGoQ;
import o.getProgramRedEK5gGoQ;
import o.getProgramYellowEK5gGoQ;
import o.getQEK5gGoQ;
import o.getREK5gGoQ;
import o.getRefreshEK5gGoQ;
import o.getRightBracketEK5gGoQ;
import o.getSearchEK5gGoQ;
import o.getSemicolonEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcq extends zzbm implements getProgramRedEK5gGoQ {
    public static getProgramRedEK5gGoQ asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (iInterfaceQueryLocalInterface instanceof getProgramRedEK5gGoQ) {
            return (getProgramRedEK5gGoQ) iInterfaceQueryLocalInterface;
        }
        return new getProfileSwitchEK5gGoQ(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        getQEK5gGoQ getprogramgreenek5ggoq;
        boolean z;
        getQEK5gGoQ getqek5ggoq = null;
        getRightBracketEK5gGoQ getrek5ggoq = null;
        getQEK5gGoQ getprogramgreenek5ggoq2 = null;
        getQEK5gGoQ getprogramgreenek5ggoq3 = null;
        getQEK5gGoQ getprogramgreenek5ggoq4 = null;
        getQEK5gGoQ getprogramgreenek5ggoq5 = null;
        getProgramYellowEK5gGoQ getrefreshek5ggoq = null;
        getProgramYellowEK5gGoQ getrefreshek5ggoq2 = null;
        getProgramYellowEK5gGoQ getrefreshek5ggoq3 = null;
        getQEK5gGoQ getprogramgreenek5ggoq6 = null;
        getQEK5gGoQ getprogramgreenek5ggoq7 = null;
        getQEK5gGoQ getprogramgreenek5ggoq8 = null;
        getQEK5gGoQ getprogramgreenek5ggoq9 = null;
        getQEK5gGoQ getprogramgreenek5ggoq10 = null;
        getQEK5gGoQ getprogramgreenek5ggoq11 = null;
        getSemicolonEK5gGoQ getsearchek5ggoq = null;
        getQEK5gGoQ getprogramgreenek5ggoq12 = null;
        getQEK5gGoQ getprogramgreenek5ggoq13 = null;
        getQEK5gGoQ getprogramgreenek5ggoq14 = null;
        getQEK5gGoQ getprogramgreenek5ggoq15 = null;
        getQEK5gGoQ getprogramgreenek5ggoq16 = null;
        switch (i) {
            case 1:
                accessgetTwocp accessgettwocpAsInterface = ObjectWrapper.asInterface(parcel.readStrongBinder());
                zzdd zzddVar = (zzdd) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzdd.CREATOR);
                long j = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                initialize(accessgettwocpAsInterface, zzddVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq = (getQEK5gGoQ) iInterfaceQueryLocalInterface;
                    } else {
                        getprogramgreenek5ggoq = new getProgramGreenEK5gGoQ(strongBinder);
                    }
                    getqek5ggoq = getprogramgreenek5ggoq;
                }
                long j3 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                logEventAndBundle(string3, string4, bundle2, getqek5ggoq, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                accessgetTwocp accessgettwocpAsInterface2 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                ClassLoader classLoader = getPageDownEK5gGoQ.serializer;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setUserProperty(string5, string6, accessgettwocpAsInterface2, z4, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = getPageDownEK5gGoQ.serializer;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface2 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq16 = (getQEK5gGoQ) iInterfaceQueryLocalInterface2;
                    } else {
                        getprogramgreenek5ggoq16 = new getProgramGreenEK5gGoQ(strongBinder2);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                getUserProperties(string7, string8, z, getprogramgreenek5ggoq16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface3 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq15 = (getQEK5gGoQ) iInterfaceQueryLocalInterface3;
                    } else {
                        getprogramgreenek5ggoq15 = new getProgramGreenEK5gGoQ(strongBinder3);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                getMaxUserProperties(string9, getprogramgreenek5ggoq15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface4 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq14 = (getQEK5gGoQ) iInterfaceQueryLocalInterface4;
                    } else {
                        getprogramgreenek5ggoq14 = new getProgramGreenEK5gGoQ(strongBinder4);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                getConditionalUserProperties(string13, string14, getprogramgreenek5ggoq14);
                break;
            case 11:
                ClassLoader classLoader3 = getPageDownEK5gGoQ.serializer;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                accessgetTwocp accessgettwocpAsInterface3 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setCurrentScreen(accessgettwocpAsInterface3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface5 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq13 = (getQEK5gGoQ) iInterfaceQueryLocalInterface5;
                    } else {
                        getprogramgreenek5ggoq13 = new getProgramGreenEK5gGoQ(strongBinder5);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                getCurrentScreenName(getprogramgreenek5ggoq13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface6 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq12 = (getQEK5gGoQ) iInterfaceQueryLocalInterface6;
                    } else {
                        getprogramgreenek5ggoq12 = new getProgramGreenEK5gGoQ(strongBinder6);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                getCurrentScreenClass(getprogramgreenek5ggoq12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (iInterfaceQueryLocalInterface7 instanceof getSemicolonEK5gGoQ) {
                        getsearchek5ggoq = (getSemicolonEK5gGoQ) iInterfaceQueryLocalInterface7;
                    } else {
                        getsearchek5ggoq = new getSearchEK5gGoQ(strongBinder7);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                setInstanceIdProvider(getsearchek5ggoq);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface8 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq11 = (getQEK5gGoQ) iInterfaceQueryLocalInterface8;
                    } else {
                        getprogramgreenek5ggoq11 = new getProgramGreenEK5gGoQ(strongBinder8);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                getCachedAppInstanceId(getprogramgreenek5ggoq11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface9 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq10 = (getQEK5gGoQ) iInterfaceQueryLocalInterface9;
                    } else {
                        getprogramgreenek5ggoq10 = new getProgramGreenEK5gGoQ(strongBinder9);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                getAppInstanceId(getprogramgreenek5ggoq10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface10 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq9 = (getQEK5gGoQ) iInterfaceQueryLocalInterface10;
                    } else {
                        getprogramgreenek5ggoq9 = new getProgramGreenEK5gGoQ(strongBinder10);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                getGmpAppId(getprogramgreenek5ggoq9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface11 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq8 = (getQEK5gGoQ) iInterfaceQueryLocalInterface11;
                    } else {
                        getprogramgreenek5ggoq8 = new getProgramGreenEK5gGoQ(strongBinder11);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                generateEventId(getprogramgreenek5ggoq8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                accessgetTwocp accessgettwocpAsInterface4 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityStarted(accessgettwocpAsInterface4, j14);
                break;
            case 26:
                accessgetTwocp accessgettwocpAsInterface5 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityStopped(accessgettwocpAsInterface5, j15);
                break;
            case 27:
                accessgetTwocp accessgettwocpAsInterface6 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityCreated(accessgettwocpAsInterface6, bundle5, j16);
                break;
            case 28:
                accessgetTwocp accessgettwocpAsInterface7 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityDestroyed(accessgettwocpAsInterface7, j17);
                break;
            case 29:
                accessgetTwocp accessgettwocpAsInterface8 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityPaused(accessgettwocpAsInterface8, j18);
                break;
            case 30:
                accessgetTwocp accessgettwocpAsInterface9 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityResumed(accessgettwocpAsInterface9, j19);
                break;
            case 31:
                accessgetTwocp accessgettwocpAsInterface10 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface12 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq7 = (getQEK5gGoQ) iInterfaceQueryLocalInterface12;
                    } else {
                        getprogramgreenek5ggoq7 = new getProgramGreenEK5gGoQ(strongBinder12);
                    }
                }
                long j20 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivitySaveInstanceState(accessgettwocpAsInterface10, getprogramgreenek5ggoq7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface13 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq6 = (getQEK5gGoQ) iInterfaceQueryLocalInterface13;
                    } else {
                        getprogramgreenek5ggoq6 = new getProgramGreenEK5gGoQ(strongBinder13);
                    }
                }
                long j21 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                performAction(bundle6, getprogramgreenek5ggoq6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                accessgetTwocp accessgettwocpAsInterface11 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                accessgetTwocp accessgettwocpAsInterface12 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                accessgetTwocp accessgettwocpAsInterface13 = ObjectWrapper.asInterface(parcel.readStrongBinder());
                getPageDownEK5gGoQ.read(parcel);
                logHealthData(i2, string19, accessgettwocpAsInterface11, accessgettwocpAsInterface12, accessgettwocpAsInterface13);
                break;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (iInterfaceQueryLocalInterface14 instanceof getProgramYellowEK5gGoQ) {
                        getrefreshek5ggoq3 = (getProgramYellowEK5gGoQ) iInterfaceQueryLocalInterface14;
                    } else {
                        getrefreshek5ggoq3 = new getRefreshEK5gGoQ(strongBinder14);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                setEventInterceptor(getrefreshek5ggoq3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (iInterfaceQueryLocalInterface15 instanceof getProgramYellowEK5gGoQ) {
                        getrefreshek5ggoq2 = (getProgramYellowEK5gGoQ) iInterfaceQueryLocalInterface15;
                    } else {
                        getrefreshek5ggoq2 = new getRefreshEK5gGoQ(strongBinder15);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                registerOnMeasurementEventListener(getrefreshek5ggoq2);
                break;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (iInterfaceQueryLocalInterface16 instanceof getProgramYellowEK5gGoQ) {
                        getrefreshek5ggoq = (getProgramYellowEK5gGoQ) iInterfaceQueryLocalInterface16;
                    } else {
                        getrefreshek5ggoq = new getRefreshEK5gGoQ(strongBinder16);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                unregisterOnMeasurementEventListener(getrefreshek5ggoq);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(getPageDownEK5gGoQ.serializer);
                getPageDownEK5gGoQ.read(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface17 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq5 = (getQEK5gGoQ) iInterfaceQueryLocalInterface17;
                    } else {
                        getprogramgreenek5ggoq5 = new getProgramGreenEK5gGoQ(strongBinder17);
                    }
                }
                int i3 = parcel.readInt();
                getPageDownEK5gGoQ.read(parcel);
                getTestFlag(getprogramgreenek5ggoq5, i3);
                break;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                ClassLoader classLoader4 = getPageDownEK5gGoQ.serializer;
                z = parcel.readInt() != 0;
                getPageDownEK5gGoQ.read(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface18 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq4 = (getQEK5gGoQ) iInterfaceQueryLocalInterface18;
                    } else {
                        getprogramgreenek5ggoq4 = new getProgramGreenEK5gGoQ(strongBinder18);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                isDataCollectionEnabled(getprogramgreenek5ggoq4);
                break;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                Bundle bundle7 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setConsent(bundle8, j23);
                break;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                Bundle bundle9 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface19 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq3 = (getQEK5gGoQ) iInterfaceQueryLocalInterface19;
                    } else {
                        getprogramgreenek5ggoq3 = new getProgramGreenEK5gGoQ(strongBinder19);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                getSessionId(getprogramgreenek5ggoq3);
                break;
            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                Intent intent = (Intent) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Intent.CREATOR);
                getPageDownEK5gGoQ.read(parcel);
                setSgtmDebugInfo(intent);
                break;
            case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                zzdf zzdfVar = (zzdf) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzdf.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                setCurrentScreenByScionActivityInfo(zzdfVar, string20, string21, j25);
                break;
            case 51:
                zzdf zzdfVar2 = (zzdf) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzdf.CREATOR);
                long j26 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityStartedByScionActivityInfo(zzdfVar2, j26);
                break;
            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                zzdf zzdfVar3 = (zzdf) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzdf.CREATOR);
                long j27 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityStoppedByScionActivityInfo(zzdfVar3, j27);
                break;
            case 53:
                zzdf zzdfVar4 = (zzdf) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzdf.CREATOR);
                Bundle bundle10 = (Bundle) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityCreatedByScionActivityInfo(zzdfVar4, bundle10, j28);
                break;
            case 54:
                zzdf zzdfVar5 = (zzdf) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzdf.CREATOR);
                long j29 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityDestroyedByScionActivityInfo(zzdfVar5, j29);
                break;
            case 55:
                zzdf zzdfVar6 = (zzdf) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzdf.CREATOR);
                long j30 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityPausedByScionActivityInfo(zzdfVar6, j30);
                break;
            case 56:
                zzdf zzdfVar7 = (zzdf) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzdf.CREATOR);
                long j31 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivityResumedByScionActivityInfo(zzdfVar7, j31);
                break;
            case 57:
                zzdf zzdfVar8 = (zzdf) getPageDownEK5gGoQ.IconCompatParcelizer(parcel, zzdf.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface20 instanceof getQEK5gGoQ) {
                        getprogramgreenek5ggoq2 = (getQEK5gGoQ) iInterfaceQueryLocalInterface20;
                    } else {
                        getprogramgreenek5ggoq2 = new getProgramGreenEK5gGoQ(strongBinder20);
                    }
                }
                long j32 = parcel.readLong();
                getPageDownEK5gGoQ.read(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdfVar8, getprogramgreenek5ggoq2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    if (iInterfaceQueryLocalInterface21 instanceof getRightBracketEK5gGoQ) {
                        getrek5ggoq = (getRightBracketEK5gGoQ) iInterfaceQueryLocalInterface21;
                    } else {
                        getrek5ggoq = new getREK5gGoQ(strongBinder21);
                    }
                }
                getPageDownEK5gGoQ.read(parcel);
                retrieveAndUploadBatches(getrek5ggoq);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
