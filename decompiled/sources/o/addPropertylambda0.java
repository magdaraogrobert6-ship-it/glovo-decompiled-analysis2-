package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes4.dex */
final class addPropertylambda0 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA read;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        ControlMessage controlMessage2 = ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_START;
        r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA r8lambdamktfdivb4gs5u8ga0i2g82w8lba = this.read;
        if (controlMessage == controlMessage2) {
            r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA.write(r8lambdamktfdivb4gs5u8ga0i2g82w8lba);
        } else if (controlMessage == ControlMessage.ONDEVICE_TRANSPORT_CLASSIFIER_STOP) {
            r8lambdamktfdivb4gs5u8ga0i2g82w8lba.RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addPropertylambda0(r8lambdaMKTFdivb4Gs5U8gA0I2g82W8lbA r8lambdamktfdivb4gs5u8ga0i2g82w8lba, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "TransportClassifier");
        this.read = r8lambdamktfdivb4gs5u8ga0i2g82w8lba;
    }
}
