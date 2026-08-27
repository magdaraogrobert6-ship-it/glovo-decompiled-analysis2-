package o;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdanR6s9bpMqHHF1KzKTWIbxoSaF7s extends hasAlpha {
    public boolean read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdanR6s9bpMqHHF1KzKTWIbxoSaF7s(DateTimeConverter dateTimeConverter, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(dateTimeConverter);
        dateTimeConverter.getClass();
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.hasAlpha, o.DateTimeConverter
    public final void write(RegistryMissingComponentException registryMissingComponentException, long j) throws EOFException {
        registryMissingComponentException.getClass();
        if (this.read) {
            registryMissingComponentException.RatingCompat(j);
            return;
        }
        try {
            this.MediaMetadataCompat.write(registryMissingComponentException, j);
        } catch (IOException e) {
            this.read = true;
            this.serializer.invoke(e);
        }
    }

    @Override // o.hasAlpha, o.DateTimeConverter, java.io.Flushable
    public final void flush() {
        if (this.read) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.read = true;
            this.serializer.invoke(e);
        }
    }

    @Override // o.hasAlpha, o.DateTimeConverter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.read = true;
            this.serializer.invoke(e);
        }
    }
}
