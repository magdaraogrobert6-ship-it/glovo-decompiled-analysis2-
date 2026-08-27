package o;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaPEKLZSS3x8gRcg7wX1Ah0ngFykY extends getLatitudeannotations<r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A> {
    final /* synthetic */ r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaPEKLZSS3x8gRcg7wX1Ah0ngFykY(r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo r8lambdadcttszpevxh1yemb7jfa8hthgho, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "VoipCallDetector");
        this.RemoteActionCompatParcelizer = r8lambdadcttszpevxh1yemb7jfa8hthgho;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A> getlongitudeannotations) {
        Byte b;
        r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A r8lambda2l1vxswbmfutp9a4iejxpq7zf7a = getlongitudeannotations.read();
        long jWrite = getlongitudeannotations.write();
        if (r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.serializer.byteValue() == 1 && (b = r8lambda2l1vxswbmfutp9a4iejxpq7zf7a.read) != null && b.byteValue() == 1) {
            r8lambdaDCtTszpeVXh1yEMB7Jfa8hThGHo r8lambdadcttszpevxh1yemb7jfa8hthgho = this.RemoteActionCompatParcelizer;
            synchronized (r8lambdadcttszpevxh1yemb7jfa8hthgho) {
                if (r8lambdadcttszpevxh1yemb7jfa8hthgho.serializer) {
                    r8lambdadcttszpevxh1yemb7jfa8hthgho.write(jWrite);
                }
            }
        }
    }
}
