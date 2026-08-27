package o;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc implements eotfFunclambda0 {
    public final eotfFunclambda0 serializer;
    public final eotfFunclambda0 write;

    @Override // o.eotfFunclambda0
    public final int hashCode() {
        return this.serializer.hashCode() + (this.write.hashCode() * 31);
    }

    @Override // o.eotfFunclambda0
    public final void serializer(MessageDigest messageDigest) {
        this.write.serializer(messageDigest);
        this.serializer.serializer(messageDigest);
    }

    public r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc(eotfFunclambda0 eotffunclambda0, eotfFunclambda0 eotffunclambda1) {
        this.write = eotffunclambda0;
        this.serializer = eotffunclambda1;
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.write + ", signature=" + this.serializer + '}';
    }

    @Override // o.eotfFunclambda0
    public final boolean equals(Object obj) {
        if (!(obj instanceof r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc)) {
            return false;
        }
        r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc r8lambdaorypq8_4ibzyferyrc7kwkieahc = (r8lambdaoRYpq8_4IBzyFERyRC7kwkIeAHc) obj;
        return this.write.equals(r8lambdaorypq8_4ibzyferyrc7kwkieahc.write) && this.serializer.equals(r8lambdaorypq8_4ibzyferyrc7kwkieahc.serializer);
    }
}
