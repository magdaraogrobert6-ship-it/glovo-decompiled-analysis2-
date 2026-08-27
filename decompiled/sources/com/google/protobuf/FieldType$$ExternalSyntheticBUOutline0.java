package com.google.protobuf;

import android.os.Bundle;
import android.telephony.CellSignalStrengthNr;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.GmsRpc;
import com.google.gson.JsonIOException;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.reactivex.Maybe;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.completable.CompletableEmpty;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.reactivex.internal.operators.observable.ObservableFromIterable;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.AndroidClipboard;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.OuterPlacementScope;
import o.PausedPrecompositionImpl;
import o.ViewInterop_androidKt;
import o.accessgetAddChangeCallbackMethodcp;
import o.accessgetBrightnessDowncp;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FieldType$$ExternalSyntheticBUOutline0 implements Consumer, Action, Function, Predicate, OuterPlacementScope, accessgetBrightnessDowncp, PausedPrecompositionImpl {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ FieldType$$ExternalSyntheticBUOutline0(GmsRpc gmsRpc) {
        this.RemoteActionCompatParcelizer = 20;
    }

    public static /* synthetic */ void serializer(int i, int i2, Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append(obj3);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // io.reactivex.functions.Predicate
    public boolean read(Object obj) {
        Boolean bool = (Boolean) obj;
        return !(this.RemoteActionCompatParcelizer != 7 ? bool.booleanValue() : bool.booleanValue());
    }

    public static /* synthetic */ void IconCompatParcelizer(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            SentryLogcatAdapter.serializer("FIAM.Headless", "Rate limiter client write failure");
            return;
        }
        if (i == 6) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
            return;
        }
        if (i == 8) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer("Service fetch error: " + ((Throwable) obj).getMessage());
            return;
        }
        if (i == 10) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer("Cache write error: " + ((Throwable) obj).getMessage());
            return;
        }
        if (i == 12) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer("Impression store read fail: " + ((Throwable) obj).getMessage());
        } else if (i == 14) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        } else if (i != 15) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer("Impressions store read fail: " + ((Throwable) obj).getMessage());
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer("Cache read error: " + ((Throwable) obj).getMessage());
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 3) {
            return ((CampaignImpressionList) obj).getAlreadySeenCampaignsList();
        }
        if (i == 4) {
            List list = (List) obj;
            ObjectHelper.write(list, "source is null");
            return new ObservableFromIterable(list);
        }
        if (i == 5) {
            return ((CampaignImpression) obj).getCampaignId();
        }
        if (i == 11) {
            return CompletableEmpty.write;
        }
        if (i != 16) {
            accessgetAddChangeCallbackMethodcp accessgetaddchangecallbackmethodcp = (accessgetAddChangeCallbackMethodcp) obj;
            accessgetaddchangecallbackmethodcp.getClass();
            ProtobufEncoder protobufEncoder = AndroidClipboard.RemoteActionCompatParcelizer;
            protobufEncoder.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                protobufEncoder.write(accessgetaddchangecallbackmethodcp, byteArrayOutputStream);
            } catch (IOException unused) {
            }
            return byteArrayOutputStream.toByteArray();
        }
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        int i2 = ViewInterop_androidKt.write[campaignProto$ThickContent.getContent().getMessageDetailsCase().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return Maybe.RemoteActionCompatParcelizer(campaignProto$ThickContent);
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        return MaybeEmpty.IconCompatParcelizer;
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        if (this.RemoteActionCompatParcelizer != 2) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
        }
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) throws IOException {
        int i;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 18) {
            i = 403;
        } else {
            if (i2 != 19) {
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null) {
                        return string;
                    }
                    String string2 = bundle.getString("unregistered");
                    if (string2 != null) {
                        return string2;
                    }
                    String string3 = bundle.getString(FWFConstants.EXPLANATION_TYPE_ERROR);
                    if ("RST".equals(string3)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("INSTANCE_ID_RESET");
                    } else if (string3 != null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(string3);
                    } else {
                        SentryLogcatAdapter.write("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("SERVICE_NOT_AVAILABLE");
                    }
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("SERVICE_NOT_AVAILABLE");
                }
                return null;
            }
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ FieldType$$ExternalSyntheticBUOutline0(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public static /* synthetic */ void read(float f, String str) {
        throw new IllegalArgumentException(str + f);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* bridge */ /* synthetic */ Class write() {
        return CellSignalStrengthNr.class;
    }

    public static /* synthetic */ void read(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void serializer(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void write(StringBuilder sb, int i, int i2) {
        sb.append(" for item at position = ");
        sb.append(i);
        sb.append(" for viewType = ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
    }
}
