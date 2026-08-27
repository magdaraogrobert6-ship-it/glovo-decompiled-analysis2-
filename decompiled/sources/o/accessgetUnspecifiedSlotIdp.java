package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetUnspecifiedSlotIdp extends timesUQTWf7w {
    @Override // o.timesUQTWf7w
    public final void write(getMessageannotations getmessageannotations, float f, float f2) {
        getmessageannotations.write(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        accessgetState accessgetstate = new accessgetState(0.0f, 0.0f, f3, f3);
        accessgetstate.write = 180.0f;
        accessgetstate.MediaSessionCompatQueueItem = 90.0f;
        getmessageannotations.RemoteActionCompatParcelizer.add(accessgetstate);
        SubcomposeLayoutKtSubcomposeLayout5 subcomposeLayoutKtSubcomposeLayout5 = new SubcomposeLayoutKtSubcomposeLayout5(accessgetstate);
        getmessageannotations.serializer(180.0f);
        getmessageannotations.MediaDescriptionCompat.add(subcomposeLayoutKtSubcomposeLayout5);
        getmessageannotations.write = 270.0f;
        float f4 = (f3 + 0.0f) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        getmessageannotations.read = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        getmessageannotations.serializer = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
