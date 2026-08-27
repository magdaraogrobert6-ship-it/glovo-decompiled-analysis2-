package o;

/* JADX INFO: loaded from: classes.dex */
public final class computePrimariesui_graphics implements getInverseTransformui_graphics {
    public final /* synthetic */ r8lambdaD96iEcIUdknPeYphmySUeDTc3iU IconCompatParcelizer;
    public final Object read;

    public /* synthetic */ computePrimariesui_graphics(r8lambdaD96iEcIUdknPeYphmySUeDTc3iU r8lambdad96ieciudknpeyphmysuedtc3iu, Object obj) {
        this.IconCompatParcelizer = r8lambdad96ieciudknpeyphmysuedtc3iu;
        this.read = obj;
    }

    @Override // o.getInverseTransformui_graphics
    public void serializer(Object obj) {
        generateOetflambda3 generateoetflambda3 = (generateOetflambda3) this.IconCompatParcelizer;
        drawLine1RTmtNc drawline1rtmtnc = (drawLine1RTmtNc) this.read;
        drawLine1RTmtNc drawline1rtmtnc2 = generateoetflambda3.read;
        if (drawline1rtmtnc2 == null || drawline1rtmtnc2 != drawline1rtmtnc) {
            return;
        }
        generateOetflambda3 generateoetflambda4 = (generateOetflambda3) this.IconCompatParcelizer;
        drawLine1RTmtNc drawline1rtmtnc3 = (drawLine1RTmtNc) this.read;
        accessisWideGamut accessiswidegamut = generateoetflambda4.serializer.write;
        if (obj == null || !accessiswidegamut.read(drawline1rtmtnc3.IconCompatParcelizer.RemoteActionCompatParcelizer())) {
            com.bumptech.glide.load.engine.DecodeJob decodeJob = generateoetflambda4.IconCompatParcelizer;
            eotfFunclambda0 eotffunclambda0 = drawline1rtmtnc3.RemoteActionCompatParcelizer;
            getPrimaries getprimaries = drawline1rtmtnc3.IconCompatParcelizer;
            decodeJob.IconCompatParcelizer(eotffunclambda0, obj, getprimaries, getprimaries.RemoteActionCompatParcelizer(), generateoetflambda4.MediaMetadataCompat);
            return;
        }
        generateoetflambda4.write = obj;
        com.bumptech.glide.load.engine.DecodeJob decodeJob2 = generateoetflambda4.IconCompatParcelizer;
        decodeJob2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg.SWITCH_TO_SOURCE_SERVICE;
        accessisSrgb accessissrgb = decodeJob2.RemoteActionCompatParcelizer;
        (accessissrgb.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg ? accessissrgb.IconCompatParcelizer : accessissrgb.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).execute(decodeJob2);
    }

    @Override // o.getInverseTransformui_graphics
    public void write(Exception exc) {
        generateOetflambda3 generateoetflambda3 = (generateOetflambda3) this.IconCompatParcelizer;
        drawLine1RTmtNc drawline1rtmtnc = (drawLine1RTmtNc) this.read;
        drawLine1RTmtNc drawline1rtmtnc2 = generateoetflambda3.read;
        if (drawline1rtmtnc2 == null || drawline1rtmtnc2 != drawline1rtmtnc) {
            return;
        }
        generateOetflambda3 generateoetflambda4 = (generateOetflambda3) this.IconCompatParcelizer;
        drawLine1RTmtNc drawline1rtmtnc3 = (drawLine1RTmtNc) this.read;
        com.bumptech.glide.load.engine.DecodeJob decodeJob = generateoetflambda4.IconCompatParcelizer;
        r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc r8lambdaorypq8_4ibzyferyrc7kwkieahc = generateoetflambda4.MediaMetadataCompat;
        getPrimaries getprimaries = drawline1rtmtnc3.IconCompatParcelizer;
        decodeJob.read(r8lambdaorypq8_4ibzyferyrc7kwkieahc, exc, getprimaries, getprimaries.RemoteActionCompatParcelizer());
    }
}
