package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Glide;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import o.RenderIntentCompanion;
import o.configureStrokePaintho4zsrM;
import o.getActiveFocusTargetNode;
import o.getInverseTransformui_graphics;
import o.getPrimaries;
import o.getTransferParameters;
import o.r8lambda2VX7w3NqocckTJShR9pmH9v5PwI;
import o.r8lambdaROecBUZgSPzHX8znzqeZViNrtE;
import o.r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I;
import o.resizeToBitmapDimensionslambda3;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbFetcher implements getPrimaries {
    public final Object IconCompatParcelizer;
    public final Comparable read;
    public Object serializer;
    public final /* synthetic */ int write;

    @Override // o.getPrimaries
    public final void read() {
    }

    public /* synthetic */ ThumbFetcher(Comparable comparable, Object obj, int i) {
        this.write = i;
        this.read = comparable;
        this.IconCompatParcelizer = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037 A[PHI: r6
  0x0037: PHI (r6v3 android.database.Cursor) = (r6v2 android.database.Cursor), (r6v13 android.database.Cursor) binds: [B:17:0x0035, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00bb: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:56:0x00bb */
    public InputStream IconCompatParcelizer() throws Throwable {
        Cursor cursorWrite;
        Cursor cursor;
        String string;
        InputStream inputStreamOpenInputStream;
        int iSerializer;
        File file;
        r8lambdaROecBUZgSPzHX8znzqeZViNrtE r8lambdaroecbuzgspzhx8znzqezvinrte = (r8lambdaROecBUZgSPzHX8znzqeZViNrtE) this.IconCompatParcelizer;
        ContentResolver contentResolver = r8lambdaroecbuzgspzhx8znzqezvinrte.IconCompatParcelizer;
        Uri uri = (Uri) this.read;
        Cursor cursor2 = null;
        inputStreamOpenInputStream = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    cursorWrite = r8lambdaroecbuzgspzhx8znzqezvinrte.read.write(uri);
                    if (cursorWrite != null) {
                        try {
                            if (cursorWrite.moveToFirst()) {
                                string = cursorWrite.getString(0);
                                cursorWrite.close();
                            }
                        } catch (SecurityException unused) {
                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                Objects.toString(uri);
                            }
                            if (cursorWrite != null) {
                                cursorWrite.close();
                            }
                        }
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists() || 0 >= file.length()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                Uri uriFromFile = Uri.fromFile(file);
                                try {
                                    inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                                } catch (NullPointerException e) {
                                    throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
                                }
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iSerializer = resizeToBitmapDimensionslambda3.serializer(r8lambdaroecbuzgspzhx8znzqezvinrte.serializer, inputStreamOpenInputStream2, r8lambdaroecbuzgspzhx8znzqezvinrte.RemoteActionCompatParcelizer);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                            } catch (IOException | NullPointerException unused3) {
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Objects.toString(uri);
                                }
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                iSerializer = -1;
                            }
                        } else {
                            iSerializer = -1;
                        }
                        if (iSerializer != -1) {
                            return new getTransferParameters(iSerializer, inputStreamOpenInputStream);
                        }
                        return inputStreamOpenInputStream;
                    }
                    if (cursorWrite != null) {
                        cursorWrite.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SecurityException unused5) {
                cursorWrite = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iSerializer = resizeToBitmapDimensionslambda3.serializer(r8lambdaroecbuzgspzhx8znzqezvinrte.serializer, inputStreamOpenInputStream2, r8lambdaroecbuzgspzhx8znzqezvinrte.RemoteActionCompatParcelizer);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iSerializer = -1;
            }
            if (iSerializer != -1) {
                return new getTransferParameters(iSerializer, inputStreamOpenInputStream);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            if (inputStreamOpenInputStream2 != null) {
                try {
                    inputStreamOpenInputStream2.close();
                } catch (IOException unused6) {
                }
            }
            throw th3;
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
    }

    public static ThumbFetcher read(Context context, Uri uri, r8lambda2VX7w3NqocckTJShR9pmH9v5PwI r8lambda2vx7w3nqoccktjshr9pmh9v5pwi) {
        return new ThumbFetcher(uri, new r8lambdaROecBUZgSPzHX8znzqeZViNrtE(Glide.IconCompatParcelizer(context).RatingCompat.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(), r8lambda2vx7w3nqoccktjshr9pmh9v5pwi, Glide.IconCompatParcelizer(context).write, context.getContentResolver()), 0);
    }

    @Override // o.getPrimaries
    public final r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I RemoteActionCompatParcelizer() {
        return this.write != 0 ? r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL : r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.LOCAL;
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        return this.write != 0 ? ((configureStrokePaintho4zsrM) this.IconCompatParcelizer).serializer() : InputStream.class;
    }

    @Override // o.getPrimaries
    public final void write() {
        if (this.write == 0) {
            InputStream inputStream = (InputStream) this.serializer;
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            return;
        }
        Object obj = this.serializer;
        if (obj != null) {
            try {
                if (((configureStrokePaintho4zsrM) this.IconCompatParcelizer).IconCompatParcelizer != 8) {
                    ((InputStream) obj).close();
                } else {
                    ((ParcelFileDescriptor) obj).close();
                }
            } catch (IOException unused2) {
            }
        }
    }

    @Override // o.getPrimaries
    public final void read(RenderIntentCompanion renderIntentCompanion, getInverseTransformui_graphics getinversetransformui_graphics) throws Throwable {
        if (this.write == 0) {
            try {
                InputStream inputStreamIconCompatParcelizer = IconCompatParcelizer();
                this.serializer = inputStreamIconCompatParcelizer;
                getinversetransformui_graphics.serializer(inputStreamIconCompatParcelizer);
                return;
            } catch (FileNotFoundException e) {
                Log.isLoggable("MediaStoreThumbFetcher", 3);
                getinversetransformui_graphics.write(e);
                return;
            }
        }
        try {
            configureStrokePaintho4zsrM configurestrokepaintho4zsrm = (configureStrokePaintho4zsrM) this.IconCompatParcelizer;
            File file = (File) this.read;
            Object objWrite = configurestrokepaintho4zsrm.IconCompatParcelizer != 8 ? getActiveFocusTargetNode.write(file, new FileInputStream(file)) : ParcelFileDescriptor.open(file, 268435456);
            this.serializer = objWrite;
            getinversetransformui_graphics.serializer(objWrite);
        } catch (FileNotFoundException e2) {
            Log.isLoggable("FileLoader", 3);
            getinversetransformui_graphics.write(e2);
        }
    }
}
