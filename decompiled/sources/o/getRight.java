package o;

import android.os.Trace;
import bo.app.b8$$ExternalSyntheticLambda4;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class getRight {
    public static Boolean IconCompatParcelizer;
    public static final setCurrentSemanticsNodesui write = new setCurrentSemanticsNodesui(new b8$$ExternalSyntheticLambda4(3));

    public static final void read(final androidx.compose.ui.text.AnnotatedString annotatedString, final androidx.compose.ui.text.TextStyle textStyle, final androidx.compose.ui.text.font.FontFamily.Resolver resolver, final List list, getBirthDateFull getbirthdatefull) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Executor executor = (Executor) getpostalcode.write((getNewPassword) write);
        if (executor == null || !serializer(annotatedString.length())) {
            getpostalcode.serializer(-517090505);
            getpostalcode.IconCompatParcelizer(false);
            return;
        }
        getpostalcode.serializer(-518737659);
        final androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        try {
            executor.execute(new Runnable() { // from class: o.getLeft
                @Override // java.lang.Runnable
                public final void run() {
                    updateDensity updatedensitySerializer;
                    androidx.compose.ui.text.TextStyle textStyle2 = textStyle;
                    androidx.compose.ui.unit.LayoutDirection layoutDirection2 = layoutDirection;
                    androidx.compose.ui.text.AnnotatedString annotatedString2 = annotatedString;
                    androidx.compose.ui.unit.Density density2 = density;
                    androidx.compose.ui.text.font.FontFamily.Resolver resolver2 = resolver;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        getBrush getbrushWrite = getOffsetF1C5BW0.write();
                        updateDensity updatedensity = getbrushWrite instanceof updateDensity ? (updateDensity) getbrushWrite : null;
                        if (updatedensity == null || (updatedensitySerializer = updatedensity.serializer(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            getBrush getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = updatedensitySerializer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                            try {
                                androidx.compose.ui.text.TextStyle textStyleResolveDefaults = androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle2, layoutDirection2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = instance_delegatelambda0.write;
                                }
                                androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics = new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString2, textStyleResolveDefaults, (List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) list2, density2, resolver2);
                                multiParagraphIntrinsics.getMaxIntrinsicWidth();
                                multiParagraphIntrinsics.getMinIntrinsicWidth();
                                getBrush.write(getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                                updatedensitySerializer.write().IconCompatParcelizer();
                                updatedensitySerializer.serializer();
                                Trace.endSection();
                            } catch (Throwable th) {
                                getBrush.write(getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                updatedensitySerializer.serializer();
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        getpostalcode.IconCompatParcelizer(false);
    }

    public static final boolean serializer(int i) {
        if (i >= 8 && i < 1000) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = IconCompatParcelizer;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
