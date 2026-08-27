package com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.app.GetEquipmentInfoRepository;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.Serializable;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ExecutableQueryexecuteAsList1;
import o.FontEj4NQ78default;
import o.LineBreakKt;
import o.ShortNewsContentCardView;
import o.decode;
import o.getContentViewGroupParentLayout;
import o.getUnspecifiedjp8hJ3c;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.safeSetClipToOutline;

/* JADX INFO: loaded from: classes3.dex */
public final class TurnByTurnNavigationLogger {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final FontEj4NQ78default IconCompatParcelizer;
    public final decode RemoteActionCompatParcelizer;
    public final GetEquipmentInfoRepository read;
    public final ProtobufEncoder serializer;
    public final getContentViewGroupParentLayout write;

    public TurnByTurnNavigationLogger(decode decodeVar, GetEquipmentInfoRepository getEquipmentInfoRepository, FontEj4NQ78default fontEj4NQ78default, ProtobufEncoder protobufEncoder, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = decodeVar;
        this.read = getEquipmentInfoRepository;
        this.IconCompatParcelizer = fontEj4NQ78default;
        this.serializer = protobufEncoder;
        this.write = getcontentviewgroupparentlayout;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    public static final Serializable access$getCommonParams(TurnByTurnNavigationLogger turnByTurnNavigationLogger, ShortNewsContentCardView shortNewsContentCardView) {
        LineBreakKt lineBreakKt;
        safeSetClipToOutline safesetcliptooutline;
        int i = 2 % 2;
        turnByTurnNavigationLogger.getClass();
        if (!(!(shortNewsContentCardView instanceof LineBreakKt))) {
            lineBreakKt = (LineBreakKt) shortNewsContentCardView;
            int i2 = lineBreakKt.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaMetadataCompat + 71;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                lineBreakKt.RemoteActionCompatParcelizer = i3 % 2 == 0 ? i2 / Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                lineBreakKt = new LineBreakKt(turnByTurnNavigationLogger, shortNewsContentCardView);
            }
        } else {
            lineBreakKt = new LineBreakKt(turnByTurnNavigationLogger, shortNewsContentCardView);
        }
        Object obj = lineBreakKt.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lineBreakKt.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            int i5 = MediaDescriptionCompat + 63;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safesetcliptooutline = lineBreakKt.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            safeSetClipToOutline safesetcliptooutlineWrite = turnByTurnNavigationLogger.IconCompatParcelizer.write();
            ProtobufEncoder protobufEncoder = turnByTurnNavigationLogger.serializer;
            lineBreakKt.IconCompatParcelizer = safesetcliptooutlineWrite;
            lineBreakKt.RemoteActionCompatParcelizer = 1;
            Serializable serializableInvoke = protobufEncoder.invoke(lineBreakKt);
            if (serializableInvoke == coroutineSingletons) {
                int i6 = MediaMetadataCompat + 87;
                int i7 = i6 % Fields.SpotShadowColor;
                MediaDescriptionCompat = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 39;
                MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
            int i10 = MediaDescriptionCompat + 81;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            obj = serializableInvoke;
            safesetcliptooutline = safesetcliptooutlineWrite;
        }
        return onMove.RemoteActionCompatParcelizer(safesetcliptooutline, (Map) obj);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public static final Object access$withVehicleType(TurnByTurnNavigationLogger turnByTurnNavigationLogger, Map map, ContinuationImpl continuationImpl) {
        getUnspecifiedjp8hJ3c getunspecifiedjp8hj3c;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 121;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            turnByTurnNavigationLogger.getClass();
            boolean z = continuationImpl instanceof getUnspecifiedjp8hJ3c;
            throw null;
        }
        turnByTurnNavigationLogger.getClass();
        if (continuationImpl instanceof getUnspecifiedjp8hJ3c) {
            getunspecifiedjp8hj3c = (getUnspecifiedjp8hJ3c) continuationImpl;
            int i3 = getunspecifiedjp8hj3c.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = MediaMetadataCompat + 61;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                getunspecifiedjp8hj3c.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                getunspecifiedjp8hj3c = new getUnspecifiedjp8hJ3c(turnByTurnNavigationLogger, continuationImpl);
            }
        } else {
            getunspecifiedjp8hj3c = new getUnspecifiedjp8hJ3c(turnByTurnNavigationLogger, continuationImpl);
        }
        Object objEquipmentInfo = getunspecifiedjp8hj3c.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = getunspecifiedjp8hj3c.RemoteActionCompatParcelizer;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objEquipmentInfo);
            GetEquipmentInfoRepository getEquipmentInfoRepository = turnByTurnNavigationLogger.read;
            getunspecifiedjp8hj3c.write = map;
            getunspecifiedjp8hj3c.RemoteActionCompatParcelizer = 1;
            objEquipmentInfo = getEquipmentInfoRepository.equipmentInfo(getunspecifiedjp8hj3c);
            if (objEquipmentInfo == coroutineSingletons) {
                int i7 = MediaMetadataCompat + 51;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 20 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = MediaDescriptionCompat + 67;
            MediaMetadataCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                Map map2 = getunspecifiedjp8hj3c.write;
                ExtrasKt.RemoteActionCompatParcelizer(objEquipmentInfo);
                throw null;
            }
            map = getunspecifiedjp8hj3c.write;
            ExtrasKt.RemoteActionCompatParcelizer(objEquipmentInfo);
        }
        String strRemoteActionCompatParcelizer = ((ExecutableQueryexecuteAsList1) objEquipmentInfo).RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer == null) {
            strRemoteActionCompatParcelizer = "";
        }
        return onMove.serializer(map, new onViewAttachedToWindowlambda0("vehicle_type", strRemoteActionCompatParcelizer));
    }
}
