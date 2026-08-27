package o;

import android.util.Pair;
import com.sentiance.core.model.thrift.MotionActivity;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
final class isNotificationMessage extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ handlePushStoryPageClicked read;

    public isNotificationMessage(handlePushStoryPageClicked handlepushstorypageclicked) {
        this.read = handlepushstorypageclicked;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        handlePushStoryPageClicked handlepushstorypageclicked = this.read;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = handlepushstorypageclicked.write;
        Byte b = handlepushstorypageclicked.RemoteActionCompatParcelizer;
        setsoundifpresentandsupportedlambda1.getClass();
        MotionActivity motionActivitySerializer = setSoundIfPresentAndSupportedlambda1.serializer(b);
        if (motionActivitySerializer == null) {
            return null;
        }
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY((byte) 0, 2);
        r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer = Long.valueOf(handlepushstorypageclicked.IconCompatParcelizer);
        r8lambdadeozq815xuuwmllyyvm_qv79qy.write = motionActivitySerializer;
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer = handlepushstorypageclicked.read;
        r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer = iOParser$Decoder.serializer();
        getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations getbraze_push_delivery_flush_min_keyannotationsSerializer = r8lambdadeozq815xuuwmllyyvm_qv79qy.serializer();
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda2 = handlepushstorypageclicked.write;
        String str = handlepushstorypageclicked.serializer;
        setsoundifpresentandsupportedlambda2.getClass();
        r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
        r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = getbraze_push_delivery_flush_min_keyannotationsSerializer;
        setContentCardsUnreadVisualIndicatorEnabled setcontentcardsunreadvisualindicatorenabledRatingCompat = r8lambdayc78smgbbb6fudfjq0u5z3_ls.RatingCompat();
        IOParser$Decoder iOParser$Decoder2 = new IOParser$Decoder();
        iOParser$Decoder2.RemoteActionCompatParcelizer(str);
        iOParser$Decoder2.read = setcontentcardsunreadvisualindicatorenabledRatingCompat;
        return new Pair(setsoundifpresentandsupportedlambda2.write(iOParser$Decoder2.MediaDescriptionCompat(), getbraze_push_delivery_flush_min_keyannotationsSerializer.read), null);
    }
}
