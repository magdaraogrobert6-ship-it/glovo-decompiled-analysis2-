package o;

/* JADX INFO: loaded from: classes2.dex */
public enum setAttached {
    TERABYTES(1099511627776L) { // from class: o.setAttached.3
        @Override // o.setAttached
        public long convert(long j, setAttached setattached) {
            return setattached.toTerabytes(j);
        }
    },
    GIGABYTES(1073741824) { // from class: o.setAttached.5
        @Override // o.setAttached
        public long convert(long j, setAttached setattached) {
            return setattached.toGigabytes(j);
        }
    },
    MEGABYTES(1048576) { // from class: o.setAttached.4
        @Override // o.setAttached
        public long convert(long j, setAttached setattached) {
            return setattached.toMegabytes(j);
        }
    },
    KILOBYTES(1024) { // from class: o.setAttached.2
        @Override // o.setAttached
        public long convert(long j, setAttached setattached) {
            return setattached.toKilobytes(j);
        }
    },
    BYTES(1) { // from class: o.setAttached.1
        @Override // o.setAttached
        public long convert(long j, setAttached setattached) {
            return setattached.toBytes(j);
        }
    };

    long numBytes;

    public abstract long convert(long j, setAttached setattached);

    public long toBytes(long j) {
        return j * this.numBytes;
    }

    setAttached(long j) {
        this.numBytes = j;
    }

    public long toGigabytes(long j) {
        return (j * this.numBytes) / GIGABYTES.numBytes;
    }

    public long toKilobytes(long j) {
        return (j * this.numBytes) / KILOBYTES.numBytes;
    }

    public long toMegabytes(long j) {
        return (j * this.numBytes) / MEGABYTES.numBytes;
    }

    public long toTerabytes(long j) {
        return (j * this.numBytes) / TERABYTES.numBytes;
    }
}
