package o;

import com.sentiance.sdk.tile.store.ZippedByteStringTileStore$loadTile$result$1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI<T> {
    private final getEventName RemoteActionCompatParcelizer;
    private final parseLonglambda0 write;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract T serializer(InputStream inputStream) throws IOException;

    public final setSubtitleGravity IconCompatParcelizer(File file) {
        long jMax;
        ZipEntry zipEntryNextElement;
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                if (!enumerationEntries.hasMoreElements() || (zipEntryNextElement = enumerationEntries.nextElement()) == null) {
                    zipFile.close();
                    jMax = 0;
                } else {
                    jMax = Math.max(zipEntryNextElement.getSize(), 4194304L);
                    zipFile.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{zipFile, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(jMax);
    }

    static {
        new serializer(null);
    }

    public r8lambda6QsLO0kJ0Pj6G2mOIbo3MA1FI(parseLonglambda0 parselonglambda0, getEventName geteventname) {
        parselonglambda0.getClass();
        geteventname.getClass();
        this.write = parselonglambda0;
        this.RemoteActionCompatParcelizer = geteventname;
    }

    public final T RemoteActionCompatParcelizer(File file, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        T tSerializer;
        parseLonglambda0 parselonglambda0 = this.write;
        try {
            try {
                ZipFile zipFile = new ZipFile(file);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    if (!enumerationEntries.hasMoreElements()) {
                        parselonglambda0.write("Zip file " + file.getName() + " has no entries", new Object[0]);
                        zipFile.close();
                        return null;
                    }
                    InputStream inputStream = zipFile.getInputStream(enumerationEntries.nextElement());
                    if (inputStream != null) {
                        try {
                            tSerializer = serializer(inputStream);
                            inputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{inputStream, th}, sourceInformationContextOfdefault.read());
                                throw th2;
                            }
                        }
                    } else {
                        tSerializer = null;
                    }
                    zipFile.close();
                    return tSerializer;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{zipFile, th3}, sourceInformationContextOfdefault.read());
                        throw th4;
                    }
                }
            } catch (Exception e) {
                e = e;
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to parse tile file " + file.getName(), new Object[0]);
                ((ZippedByteStringTileStore$loadTile$result$1) r8lambdaunavo3sxub_pc9xroryotnrlvsm).invoke(e);
                return null;
            } catch (OutOfMemoryError e2) {
                e = e2;
                parselonglambda0.RemoteActionCompatParcelizer("Out of memory while parsing tile file %s: %s", file.getName(), e.getMessage());
                ((ZippedByteStringTileStore$loadTile$result$1) r8lambdaunavo3sxub_pc9xroryotnrlvsm).invoke(e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (OutOfMemoryError e4) {
            e = e4;
        }
    }
}
