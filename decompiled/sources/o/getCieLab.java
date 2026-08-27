package o;

import android.content.res.AssetManager;
import android.graphics.PointF;
import android.graphics.RectF;
import bo.app.af$$ExternalSyntheticOutline0;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getCieLab extends ExtendedSrgblambda0 {
    public final getTransformui_graphics _init_lambda1;
    public final ArrayList _init_lambda2;
    public final StrokeJoinCompanion _init_lambda3;
    public final HashMap _init_lambda4;
    public final ContextMenuSpec accessensureViewModelStore;
    public final getTransformui_graphics addContentView;
    public final RectF addObserverForBackInvoker;
    public final copyzey9I6wdefault addObserverForBackInvokerlambda0;
    public final ArrayList addOnConfigurationChangedListener;
    public final getTransformui_graphics addOnMultiWindowModeChangedListener;
    public final Bt2020Pqlambda1 addOnNewIntentListener;
    public final accessgetMirrorcp createFullyDrawnExecutor;
    public final getTransformui_graphics defaultViewModelProviderFactory_delegatelambda0;
    public final android.graphics.Matrix ensureViewModelStore;
    public final getTransformui_graphics fullyDrawnReporter_delegatelambda0;
    public final StringBuilder fullyDrawnReporter_delegatelambda00;
    public final StringBuilder getOnBackPressedInput;
    public final StringBuilder getSavedStateRegistryControllerannotations;
    public final copyzey9I6wdefault menuHostHelperlambda0;
    public final getTransformui_graphics onBackPressedDispatcher_delegatelambda0;
    public final getTransformui_graphics onBackPressedDispatcher_delegatelambda00;
    public final getTransformui_graphics onBackPressedDispatcher_delegatelambda010;
    public final getTransformui_graphics onBackPressedInput_delegatelambda0;
    public final StringBuilder r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    public final getCieXyz IconCompatParcelizer(int i) {
        ArrayList arrayList = this.addOnConfigurationChangedListener;
        for (int size = arrayList.size(); size < i; size++) {
            getCieXyz getciexyz = new getCieXyz();
            getciexyz.read = "";
            getciexyz.RemoteActionCompatParcelizer = 0.0f;
            arrayList.add(getciexyz);
        }
        return (getCieXyz) arrayList.get(i - 1);
    }

    public final void serializer(getMinValue getminvalue, int i, int i2) {
        copyzey9I6wdefault copyzey9i6wdefault = this.addObserverForBackInvokerlambda0;
        getTransformui_graphics gettransformui_graphics = this._init_lambda1;
        if (gettransformui_graphics == null || !write(i2)) {
            copyzey9i6wdefault.setColor(getminvalue.RemoteActionCompatParcelizer);
        } else {
            copyzey9i6wdefault.setColor(((Integer) gettransformui_graphics.IconCompatParcelizer()).intValue());
        }
        getTransformui_graphics gettransformui_graphics2 = this.fullyDrawnReporter_delegatelambda0;
        copyzey9I6wdefault copyzey9i6wdefault2 = this.menuHostHelperlambda0;
        if (gettransformui_graphics2 == null || !write(i2)) {
            copyzey9i6wdefault2.setColor(getminvalue.MediaDescriptionCompat);
        } else {
            copyzey9i6wdefault2.setColor(((Integer) gettransformui_graphics2.IconCompatParcelizer()).intValue());
        }
        getTransformui_graphics gettransformui_graphics3 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaBrowserCompatMediaItem;
        int iIntValue = 100;
        int iIntValue2 = gettransformui_graphics3 == null ? 100 : ((Integer) gettransformui_graphics3.IconCompatParcelizer()).intValue();
        getTransformui_graphics gettransformui_graphics4 = this.defaultViewModelProviderFactory_delegatelambda0;
        if (gettransformui_graphics4 != null && write(i2)) {
            iIntValue = ((Integer) gettransformui_graphics4.IconCompatParcelizer()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        copyzey9i6wdefault.setAlpha(iRound);
        copyzey9i6wdefault2.setAlpha(iRound);
        getTransformui_graphics gettransformui_graphics5 = this.onBackPressedDispatcher_delegatelambda00;
        if (gettransformui_graphics5 == null || !write(i2)) {
            copyzey9i6wdefault2.setStrokeWidth(newD50Xyzui_graphics.IconCompatParcelizer() * getminvalue.ParcelableVolumeInfo);
        } else {
            copyzey9i6wdefault2.setStrokeWidth(((Float) gettransformui_graphics5.IconCompatParcelizer()).floatValue());
        }
    }

    public final boolean serializer(android.graphics.Canvas canvas, getMinValue getminvalue, int i, float f) {
        float f2;
        PointF pointF = getminvalue.read;
        PointF pointF2 = getminvalue.serializer;
        float fIconCompatParcelizer = newD50Xyzui_graphics.IconCompatParcelizer();
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (getminvalue.MediaBrowserCompatMediaItem * fIconCompatParcelizer) + pointF.y;
        }
        float f3 = (i * getminvalue.MediaBrowserCompatMediaItem * fIconCompatParcelizer) + f2;
        if (this.createFullyDrawnExecutor.MediaSessionCompatQueueItem && pointF2 != null && pointF != null) {
            if (f3 >= pointF.y + pointF2.y + getminvalue.MediaSessionCompatQueueItem) {
                return false;
            }
        }
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = getColorSpaceui_graphics.RemoteActionCompatParcelizer[getminvalue.MediaMetadataCompat.ordinal()];
        if (i2 == 1) {
            canvas.translate(f4, f3);
            return true;
        }
        if (i2 == 2) {
            canvas.translate((f4 + f5) - f, f3);
            return true;
        }
        if (i2 != 3) {
            return true;
        }
        canvas.translate(((f5 / 2.0f) + f4) - (f / 2.0f), f3);
        return true;
    }

    public final boolean write(int i) {
        getTransformui_graphics gettransformui_graphics;
        int length = ((getMinValue) this.onBackPressedDispatcher_delegatelambda010.IconCompatParcelizer()).PlaybackStateCompatCustomAction.length();
        getTransformui_graphics gettransformui_graphics2 = this.onBackPressedDispatcher_delegatelambda0;
        if (gettransformui_graphics2 == null || (gettransformui_graphics = this.addContentView) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) gettransformui_graphics2.IconCompatParcelizer()).intValue(), ((Integer) gettransformui_graphics.IconCompatParcelizer()).intValue());
        int iMax = Math.max(((Integer) gettransformui_graphics2.IconCompatParcelizer()).intValue(), ((Integer) gettransformui_graphics.IconCompatParcelizer()).intValue());
        getTransformui_graphics gettransformui_graphics3 = this.onBackPressedInput_delegatelambda0;
        if (gettransformui_graphics3 != null) {
            int iIntValue = ((Integer) gettransformui_graphics3.IconCompatParcelizer()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.addOnNewIntentListener == Bt2020Pqlambda1.INDEX) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    @Override // o.ExtendedSrgblambda0, o.TransformOriginCompanion
    public final void read(RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        StrokeJoinCompanion strokeJoinCompanion = this._init_lambda3;
        rectF.set(0.0f, 0.0f, strokeJoinCompanion.write.width(), strokeJoinCompanion.write.height());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String write(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        ContextMenuSpec contextMenuSpec = this.accessensureViewModelStore;
        if (contextMenuSpec.read(j) >= 0) {
            return (String) contextMenuSpec.write(j);
        }
        StringBuilder sb = this.getOnBackPressedInput;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        contextMenuSpec.read(j, string);
        return string;
    }

    public getCieLab(accessgetMirrorcp accessgetmirrorcp, getAdobeRgb getadobergb) {
        androidx.transition.TransitionValuesMaps transitionValuesMaps;
        androidx.transition.TransitionValuesMaps transitionValuesMaps2;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics;
        androidx.transition.TransitionValuesMaps transitionValuesMaps3;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics2;
        androidx.transition.TransitionValuesMaps transitionValuesMaps4;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics3;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics4;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect2;
        toXyz toxyz;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect3;
        toXyz toxyz2;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect4;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics5;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect5;
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics6;
        super(accessgetmirrorcp, getadobergb);
        this.getOnBackPressedInput = new StringBuilder(2);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new StringBuilder(0);
        this.fullyDrawnReporter_delegatelambda00 = new StringBuilder(0);
        this.getSavedStateRegistryControllerannotations = new StringBuilder(0);
        this.addObserverForBackInvoker = new RectF();
        this.ensureViewModelStore = new android.graphics.Matrix();
        copyzey9I6wdefault copyzey9i6wdefault = new copyzey9I6wdefault(1, 1);
        copyzey9i6wdefault.setStyle(android.graphics.Paint.Style.FILL);
        this.addObserverForBackInvokerlambda0 = copyzey9i6wdefault;
        copyzey9I6wdefault copyzey9i6wdefault2 = new copyzey9I6wdefault(1, 2);
        copyzey9i6wdefault2.setStyle(android.graphics.Paint.Style.STROKE);
        this.menuHostHelperlambda0 = copyzey9i6wdefault2;
        this._init_lambda4 = new HashMap();
        this.accessensureViewModelStore = new ContextMenuSpec((Object) null);
        this._init_lambda2 = new ArrayList();
        this.addOnConfigurationChangedListener = new ArrayList();
        this.addOnNewIntentListener = Bt2020Pqlambda1.INDEX;
        this.createFullyDrawnExecutor = accessgetmirrorcp;
        this._init_lambda3 = getadobergb.write;
        getTransformui_graphics gettransformui_graphics = new getTransformui_graphics((List) getadobergb.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.RatingCompat, 0);
        this.onBackPressedDispatcher_delegatelambda010 = gettransformui_graphics;
        gettransformui_graphics.write(this);
        RemoteActionCompatParcelizer(gettransformui_graphics);
        accessgetGreencp accessgetgreencp = getadobergb.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (accessgetgreencp != null && (dropShadowEffect5 = (com.airbnb.lottie.parser.DropShadowEffect) accessgetgreencp.IconCompatParcelizer) != null && (xyzatocolorjlnilsgui_graphics6 = (xyzaToColorJlNiLsgui_graphics) dropShadowEffect5.read) != null) {
            getColors getcolorsWrite = xyzatocolorjlnilsgui_graphics6.write();
            this._init_lambda1 = (getTransformui_graphics) getcolorsWrite;
            getcolorsWrite.write(this);
            RemoteActionCompatParcelizer(getcolorsWrite);
        }
        if (accessgetgreencp != null && (dropShadowEffect4 = (com.airbnb.lottie.parser.DropShadowEffect) accessgetgreencp.IconCompatParcelizer) != null && (xyzatocolorjlnilsgui_graphics5 = (xyzaToColorJlNiLsgui_graphics) dropShadowEffect4.serializer) != null) {
            getColors getcolorsWrite2 = xyzatocolorjlnilsgui_graphics5.write();
            this.fullyDrawnReporter_delegatelambda0 = (getTransformui_graphics) getcolorsWrite2;
            getcolorsWrite2.write(this);
            RemoteActionCompatParcelizer(getcolorsWrite2);
        }
        if (accessgetgreencp != null && (dropShadowEffect3 = (com.airbnb.lottie.parser.DropShadowEffect) accessgetgreencp.IconCompatParcelizer) != null && (toxyz2 = (toXyz) dropShadowEffect3.RatingCompat) != null) {
            getTransformui_graphics gettransformui_graphicsWrite = toxyz2.write();
            this.onBackPressedDispatcher_delegatelambda00 = gettransformui_graphicsWrite;
            gettransformui_graphicsWrite.write(this);
            RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
        }
        if (accessgetgreencp != null && (dropShadowEffect2 = (com.airbnb.lottie.parser.DropShadowEffect) accessgetgreencp.IconCompatParcelizer) != null && (toxyz = (toXyz) dropShadowEffect2.write) != null) {
            getTransformui_graphics gettransformui_graphicsWrite2 = toxyz.write();
            this.addOnMultiWindowModeChangedListener = gettransformui_graphicsWrite2;
            gettransformui_graphicsWrite2.write(this);
            RemoteActionCompatParcelizer(gettransformui_graphicsWrite2);
        }
        if (accessgetgreencp != null && (dropShadowEffect = (com.airbnb.lottie.parser.DropShadowEffect) accessgetgreencp.IconCompatParcelizer) != null && (xyzatocolorjlnilsgui_graphics4 = (xyzaToColorJlNiLsgui_graphics) dropShadowEffect.MediaDescriptionCompat) != null) {
            getColors getcolorsWrite3 = xyzatocolorjlnilsgui_graphics4.write();
            this.defaultViewModelProviderFactory_delegatelambda0 = (getTransformui_graphics) getcolorsWrite3;
            getcolorsWrite3.write(this);
            RemoteActionCompatParcelizer(getcolorsWrite3);
        }
        if (accessgetgreencp != null && (transitionValuesMaps4 = (androidx.transition.TransitionValuesMaps) accessgetgreencp.write) != null && (xyzatocolorjlnilsgui_graphics3 = (xyzaToColorJlNiLsgui_graphics) transitionValuesMaps4.MediaBrowserCompatMediaItem) != null) {
            getColors getcolorsWrite4 = xyzatocolorjlnilsgui_graphics3.write();
            this.onBackPressedDispatcher_delegatelambda0 = (getTransformui_graphics) getcolorsWrite4;
            getcolorsWrite4.write(this);
            RemoteActionCompatParcelizer(getcolorsWrite4);
        }
        if (accessgetgreencp != null && (transitionValuesMaps3 = (androidx.transition.TransitionValuesMaps) accessgetgreencp.write) != null && (xyzatocolorjlnilsgui_graphics2 = (xyzaToColorJlNiLsgui_graphics) transitionValuesMaps3.MediaDescriptionCompat) != null) {
            getColors getcolorsWrite5 = xyzatocolorjlnilsgui_graphics2.write();
            this.addContentView = (getTransformui_graphics) getcolorsWrite5;
            getcolorsWrite5.write(this);
            RemoteActionCompatParcelizer(getcolorsWrite5);
        }
        if (accessgetgreencp != null && (transitionValuesMaps2 = (androidx.transition.TransitionValuesMaps) accessgetgreencp.write) != null && (xyzatocolorjlnilsgui_graphics = (xyzaToColorJlNiLsgui_graphics) transitionValuesMaps2.MediaMetadataCompat) != null) {
            getColors getcolorsWrite6 = xyzatocolorjlnilsgui_graphics.write();
            this.onBackPressedInput_delegatelambda0 = (getTransformui_graphics) getcolorsWrite6;
            getcolorsWrite6.write(this);
            RemoteActionCompatParcelizer(getcolorsWrite6);
        }
        if (accessgetgreencp == null || (transitionValuesMaps = (androidx.transition.TransitionValuesMaps) accessgetgreencp.write) == null) {
            return;
        }
        this.addOnNewIntentListener = (Bt2020Pqlambda1) transitionValuesMaps.RatingCompat;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0330  */
    /* JADX WARN: Code duplicated, block: B:102:0x0355  */
    /* JADX WARN: Code duplicated, block: B:105:0x0388  */
    /* JADX WARN: Code duplicated, block: B:107:0x0393  */
    /* JADX WARN: Code duplicated, block: B:108:0x0395  */
    /* JADX WARN: Code duplicated, block: B:112:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:114:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:116:0x03db  */
    /* JADX WARN: Code duplicated, block: B:118:0x03f0 A[LOOP:7: B:117:0x03ee->B:118:0x03f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0412  */
    /* JADX WARN: Code duplicated, block: B:123:0x0430  */
    /* JADX WARN: Code duplicated, block: B:124:0x0438  */
    /* JADX WARN: Code duplicated, block: B:127:0x0446 A[LOOP:9: B:125:0x0440->B:127:0x0446, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x046d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0481 A[LOOP:10: B:133:0x047b->B:135:0x0481, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x0495  */
    /* JADX WARN: Code duplicated, block: B:142:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:148:0x04cf A[LOOP:13: B:143:0x04b3->B:148:0x04cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:152:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:155:0x0508  */
    /* JADX WARN: Code duplicated, block: B:183:0x04d5 A[EDGE_INSN: B:183:0x04d5->B:149:0x04d5 BREAK  A[LOOP:12: B:140:0x04a6->B:147:0x04c6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0326  */
    @Override // o.ExtendedSrgblambda0
    public final void read(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, getA geta) {
        getName getname;
        String str;
        String str2;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect;
        android.graphics.Typeface typefaceCreateFromAsset;
        int i2;
        float fFloatValue;
        float fIconCompatParcelizer;
        List listAsList;
        int size;
        int i3;
        int i4;
        int length;
        PointF pointF;
        float f;
        List listIconCompatParcelizer;
        int i5;
        getCieXyz getciexyz;
        int i6;
        getName getname2;
        String string;
        ArrayList arrayList;
        int length2;
        int i7;
        StringBuilder sb;
        int i8;
        String string2;
        String str3;
        int i9;
        ArrayList arrayList2;
        Bidi bidi;
        int runCount;
        byte[] bArr;
        Integer[] numArr;
        int i10;
        StringBuilder sb2;
        int i11;
        int runLevel;
        String strSubstring;
        StringBuilder sb3;
        int length3;
        String str4;
        List list;
        StrokeJoinCompanion strokeJoinCompanion;
        copyzey9I6wdefault copyzey9i6wdefault;
        copyzey9I6wdefault copyzey9i6wdefault2;
        int i12 = i;
        getMinValue getminvalue = (getMinValue) this.onBackPressedDispatcher_delegatelambda010.IconCompatParcelizer();
        StrokeJoinCompanion strokeJoinCompanion2 = this._init_lambda3;
        getName getname3 = (getName) strokeJoinCompanion2.serializer.get(getminvalue.write);
        if (getname3 == null) {
            return;
        }
        String str5 = getname3.serializer;
        String str6 = getname3.read;
        canvas.save();
        canvas.concat(matrix);
        serializer(getminvalue, i12, 0);
        accessgetMirrorcp accessgetmirrorcp = this.createFullyDrawnExecutor;
        Map map = accessgetmirrorcp.MediaSessionCompatResultReceiverWrapper;
        copyzey9I6wdefault copyzey9i6wdefault3 = this.addObserverForBackInvokerlambda0;
        copyzey9I6wdefault copyzey9i6wdefault4 = this.menuHostHelperlambda0;
        getTransformui_graphics gettransformui_graphics = this.addOnMultiWindowModeChangedListener;
        String str7 = "\n";
        copyzey9I6wdefault copyzey9i6wdefault5 = copyzey9i6wdefault4;
        if (map == null && accessgetmirrorcp.MediaDescriptionCompat.RemoteActionCompatParcelizer.write() > 0) {
            float f2 = getminvalue.MediaSessionCompatQueueItem / 100.0f;
            float[] fArr = (float[]) newD50Xyzui_graphics.serializer.get();
            float f3 = 0.0f;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f4 = newD50Xyzui_graphics.RemoteActionCompatParcelizer;
            fArr[2] = f4;
            fArr[3] = f4;
            copyzey9I6wdefault copyzey9i6wdefault6 = copyzey9i6wdefault3;
            matrix.mapPoints(fArr);
            accessgetMirrorcp accessgetmirrorcp2 = accessgetmirrorcp;
            String str8 = str5;
            String str9 = str6;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList2 = Arrays.asList(getminvalue.PlaybackStateCompatCustomAction.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size2 = listAsList2.size();
            float fFloatValue2 = getminvalue.MediaSessionCompatResultReceiverWrapper / 10.0f;
            if (gettransformui_graphics != null) {
                fFloatValue2 += ((Float) gettransformui_graphics.IconCompatParcelizer()).floatValue();
            }
            float f5 = fFloatValue2;
            int i13 = 0;
            int i14 = -1;
            while (i13 < size2) {
                String str10 = (String) listAsList2.get(i13);
                PointF pointF2 = getminvalue.serializer;
                float f6 = pointF2 == null ? f3 : pointF2.x;
                float f7 = f2;
                getName getname4 = getname3;
                copyzey9I6wdefault copyzey9i6wdefault7 = copyzey9i6wdefault5;
                List list2 = listAsList2;
                int i15 = size2;
                copyzey9I6wdefault copyzey9i6wdefault8 = copyzey9i6wdefault6;
                int i16 = i13;
                getName getname5 = getname3;
                accessgetMirrorcp accessgetmirrorcp3 = accessgetmirrorcp2;
                List listIconCompatParcelizer2 = IconCompatParcelizer(str10, f6, getname4, f7, f5, true);
                int i17 = 0;
                while (i17 < listIconCompatParcelizer2.size()) {
                    getCieXyz getciexyz2 = (getCieXyz) listIconCompatParcelizer2.get(i17);
                    int i18 = i14 + 1;
                    canvas.save();
                    if (serializer(canvas, getminvalue, i18, getciexyz2.RemoteActionCompatParcelizer)) {
                        String str11 = getciexyz2.read;
                        int i19 = 0;
                        while (i19 < str11.length()) {
                            List list3 = listIconCompatParcelizer2;
                            str8 = str8;
                            str9 = str9;
                            int i20 = isSrgb.read(str11.charAt(i19), str9, str8);
                            String str12 = str11;
                            accessprocessDragStart accessprocessdragstart = strokeJoinCompanion2.RemoteActionCompatParcelizer;
                            accessprocessdragstart.getClass();
                            isSrgb issrgb = (isSrgb) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i20);
                            if (issrgb == null) {
                                str9 = str9;
                                i18 = i18;
                                str8 = str8;
                                strokeJoinCompanion = strokeJoinCompanion2;
                                copyzey9i6wdefault = copyzey9i6wdefault7;
                            } else {
                                serializer(getminvalue, i12, i19);
                                HashMap map2 = this._init_lambda4;
                                if (map2.containsKey(issrgb)) {
                                    list = (List) map2.get(issrgb);
                                } else {
                                    ArrayList arrayList3 = issrgb.read;
                                    int size3 = arrayList3.size();
                                    ArrayList arrayList4 = new ArrayList(size3);
                                    int i21 = 0;
                                    while (i21 < size3) {
                                        arrayList4.add(new accessgetCentercp(accessgetmirrorcp3, this, (rcpResponse) arrayList3.get(i21), strokeJoinCompanion2));
                                        i21++;
                                        size3 = size3;
                                        arrayList3 = arrayList3;
                                    }
                                    map2.put(issrgb, arrayList4);
                                    list = arrayList4;
                                }
                                int i22 = 0;
                                while (i22 < list.size()) {
                                    android.graphics.Path pathWrite = ((accessgetCentercp) list.get(i22)).write();
                                    pathWrite.computeBounds(this.addObserverForBackInvoker, false);
                                    android.graphics.Matrix matrix2 = this.ensureViewModelStore;
                                    matrix2.reset();
                                    StrokeJoinCompanion strokeJoinCompanion3 = strokeJoinCompanion2;
                                    matrix2.preTranslate(0.0f, (-getminvalue.IconCompatParcelizer) * newD50Xyzui_graphics.IconCompatParcelizer());
                                    matrix2.preScale(f7, f7);
                                    pathWrite.transform(matrix2);
                                    if (getminvalue.RatingCompat) {
                                        RemoteActionCompatParcelizer(pathWrite, copyzey9i6wdefault8, canvas);
                                        copyzey9i6wdefault2 = copyzey9i6wdefault7;
                                        RemoteActionCompatParcelizer(pathWrite, copyzey9i6wdefault2, canvas);
                                    } else {
                                        copyzey9i6wdefault2 = copyzey9i6wdefault7;
                                        RemoteActionCompatParcelizer(pathWrite, copyzey9i6wdefault2, canvas);
                                        RemoteActionCompatParcelizer(pathWrite, copyzey9i6wdefault8, canvas);
                                    }
                                    i22++;
                                    copyzey9i6wdefault7 = copyzey9i6wdefault2;
                                    strokeJoinCompanion2 = strokeJoinCompanion3;
                                }
                                strokeJoinCompanion = strokeJoinCompanion2;
                                copyzey9i6wdefault = copyzey9i6wdefault7;
                                canvas.translate((newD50Xyzui_graphics.IconCompatParcelizer() * ((float) issrgb.write) * f7) + f5, 0.0f);
                            }
                            i19++;
                            listIconCompatParcelizer2 = list3;
                            copyzey9i6wdefault7 = copyzey9i6wdefault;
                            str11 = str12;
                            i18 = i18;
                            strokeJoinCompanion2 = strokeJoinCompanion;
                            i12 = i;
                        }
                    }
                    canvas.restore();
                    i17++;
                    listIconCompatParcelizer2 = listIconCompatParcelizer2;
                    copyzey9i6wdefault7 = copyzey9i6wdefault7;
                    i14 = i18;
                    strokeJoinCompanion2 = strokeJoinCompanion2;
                    i12 = i;
                }
                i13 = i16 + 1;
                accessgetmirrorcp2 = accessgetmirrorcp3;
                f2 = f7;
                size2 = i15;
                getname3 = getname5;
                copyzey9i6wdefault5 = copyzey9i6wdefault7;
                f3 = 0.0f;
                strokeJoinCompanion2 = strokeJoinCompanion2;
                i12 = i;
                copyzey9i6wdefault6 = copyzey9i6wdefault8;
                listAsList2 = list2;
            }
        } else {
            char c = 2;
            Map map3 = accessgetmirrorcp.MediaSessionCompatResultReceiverWrapper;
            if (map3 != null) {
                str2 = str6;
                if (map3.containsKey(str2)) {
                    typefaceCreateFromAsset = (android.graphics.Typeface) map3.get(str2);
                    getname = getname3;
                } else {
                    getname = getname3;
                    String str13 = getname.IconCompatParcelizer;
                    if (map3.containsKey(str13)) {
                        typefaceCreateFromAsset = (android.graphics.Typeface) map3.get(str13);
                    } else {
                        str = str5;
                        String strM = af$$ExternalSyntheticOutline0.m(str2, "-", str);
                        if (map3.containsKey(strM)) {
                            typefaceCreateFromAsset = (android.graphics.Typeface) map3.get(strM);
                        }
                    }
                }
                str7 = "\n";
                if (typefaceCreateFromAsset == null) {
                    typefaceCreateFromAsset = getname.RemoteActionCompatParcelizer;
                }
                if (typefaceCreateFromAsset != null) {
                    String str14 = getminvalue.PlaybackStateCompatCustomAction;
                    copyzey9i6wdefault3.setTypeface(typefaceCreateFromAsset);
                    float f8 = getminvalue.MediaSessionCompatQueueItem;
                    copyzey9i6wdefault3.setTextSize(newD50Xyzui_graphics.IconCompatParcelizer() * f8);
                    copyzey9i6wdefault5.setTypeface(copyzey9i6wdefault3.getTypeface());
                    copyzey9i6wdefault5.setTextSize(copyzey9i6wdefault3.getTextSize());
                    fFloatValue = getminvalue.MediaSessionCompatResultReceiverWrapper / 10.0f;
                    if (gettransformui_graphics != null) {
                        fFloatValue += ((Float) gettransformui_graphics.IconCompatParcelizer()).floatValue();
                    }
                    fIconCompatParcelizer = ((newD50Xyzui_graphics.IconCompatParcelizer() * fFloatValue) * f8) / 100.0f;
                    listAsList = Arrays.asList(str14.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str7, "\r").split("\r"));
                    size = listAsList.size();
                    i3 = -1;
                    i4 = 0;
                    length = 0;
                    while (i4 < size) {
                        String str15 = (String) listAsList.get(i4);
                        pointF = getminvalue.serializer;
                        if (pointF == null) {
                            f = 0.0f;
                        } else {
                            f = pointF.x;
                        }
                        listIconCompatParcelizer = IconCompatParcelizer(str15, f, getname, 0.0f, fIconCompatParcelizer, false);
                        i5 = 0;
                        while (i5 < listIconCompatParcelizer.size()) {
                            getciexyz = (getCieXyz) listIconCompatParcelizer.get(i5);
                            i6 = i3 + 1;
                            canvas.save();
                            if (serializer(canvas, getminvalue, i6, copyzey9i6wdefault3.measureText(getciexyz.read))) {
                                string = getciexyz.read;
                                if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                                    bidi = new Bidi(string, -2);
                                    runCount = bidi.getRunCount();
                                    bArr = new byte[runCount];
                                    numArr = new Integer[runCount];
                                    i10 = 0;
                                    while (i10 < runCount) {
                                        bArr[i10] = (byte) bidi.getRunLevel(i10);
                                        numArr[i10] = Integer.valueOf(i10);
                                        i10++;
                                        getname = getname;
                                    }
                                    getname2 = getname;
                                    Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                    sb2 = this.fullyDrawnReporter_delegatelambda00;
                                    sb2.setLength(0);
                                    i11 = 0;
                                    while (i11 < runCount) {
                                        int iIntValue = numArr[i11].intValue();
                                        int i23 = runCount;
                                        int runStart = bidi.getRunStart(iIntValue);
                                        Integer[] numArr2 = numArr;
                                        int runLimit = bidi.getRunLimit(iIntValue);
                                        runLevel = bidi.getRunLevel(iIntValue);
                                        strSubstring = string.substring(runStart, runLimit);
                                        if ((runLevel & 1) == 0) {
                                            sb2.append(strSubstring);
                                            str4 = string;
                                        } else {
                                            sb3 = this.getSavedStateRegistryControllerannotations;
                                            length3 = 0;
                                            sb3.setLength(0);
                                            while (length3 < strSubstring.length()) {
                                                String strWrite = write(length3, strSubstring);
                                                sb3.insert(0, strWrite);
                                                length3 += strWrite.length();
                                                string = string;
                                            }
                                            str4 = string;
                                            sb2.append((CharSequence) sb3);
                                        }
                                        i11++;
                                        runCount = i23;
                                        numArr = numArr2;
                                        bidi = bidi;
                                        string = str4;
                                    }
                                    string = sb2.toString();
                                } else {
                                    getname2 = getname;
                                }
                                arrayList = this._init_lambda2;
                                arrayList.clear();
                                length2 = 0;
                                while (length2 < string.length()) {
                                    String strWrite2 = write(length2, string);
                                    arrayList.add(strWrite2);
                                    length2 += strWrite2.length();
                                }
                                i7 = 0;
                                while (i7 < arrayList.size()) {
                                    sb = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                                    sb.setLength(0);
                                    sb.append((String) arrayList.get(i7));
                                    i8 = i7 + 1;
                                    while (i8 < arrayList.size()) {
                                        str3 = (String) arrayList.get(i8);
                                        i9 = 0;
                                        while (true) {
                                            if (i9 < str3.length()) {
                                                break;
                                            }
                                            arrayList2 = arrayList;
                                            if (Character.getDirectionality(str3.codePointAt(i9)) == 2) {
                                                break;
                                            }
                                            i9++;
                                            arrayList = arrayList2;
                                        }
                                        sb.insert(0, str3);
                                        i8++;
                                        arrayList = arrayList2;
                                    }
                                    ArrayList arrayList5 = arrayList;
                                    string2 = sb.toString();
                                    serializer(getminvalue, i, i7 + length);
                                    if (getminvalue.RatingCompat) {
                                        RemoteActionCompatParcelizer(string2, copyzey9i6wdefault3, canvas);
                                        RemoteActionCompatParcelizer(string2, copyzey9i6wdefault5, canvas);
                                    } else {
                                        RemoteActionCompatParcelizer(string2, copyzey9i6wdefault5, canvas);
                                        RemoteActionCompatParcelizer(string2, copyzey9i6wdefault3, canvas);
                                    }
                                    canvas.translate(copyzey9i6wdefault3.measureText(string2) + fIconCompatParcelizer, 0.0f);
                                    i7 = i8;
                                    arrayList = arrayList5;
                                }
                            } else {
                                size = size;
                                i6 = i6;
                                getname2 = getname;
                            }
                            length += getciexyz.read.length();
                            canvas.restore();
                            i5++;
                            listIconCompatParcelizer = listIconCompatParcelizer;
                            listAsList = listAsList;
                            size = size;
                            i3 = i6;
                            getname = getname2;
                        }
                        i4++;
                        c = 2;
                        size = size;
                        getname = getname;
                    }
                }
            } else {
                getname = getname3;
                str = str5;
                str2 = str6;
            }
            if (accessgetmirrorcp.getCallback() == null) {
                dropShadowEffect = null;
            } else {
                if (accessgetmirrorcp.MediaSessionCompatToken == null) {
                    accessgetmirrorcp.MediaSessionCompatToken = new com.airbnb.lottie.parser.DropShadowEffect(accessgetmirrorcp.getCallback());
                }
                dropShadowEffect = accessgetmirrorcp.MediaSessionCompatToken;
            }
            if (dropShadowEffect == null) {
                str7 = "\n";
                typefaceCreateFromAsset = null;
            } else {
                toZui_graphics tozui_graphics = (toZui_graphics) dropShadowEffect.read;
                tozui_graphics.serializer = str2;
                tozui_graphics.read = str;
                HashMap map4 = (HashMap) dropShadowEffect.RatingCompat;
                android.graphics.Typeface typeface = (android.graphics.Typeface) map4.get(tozui_graphics);
                if (typeface != null) {
                    typefaceCreateFromAsset = typeface;
                    str7 = "\n";
                } else {
                    HashMap map5 = (HashMap) dropShadowEffect.write;
                    android.graphics.Typeface typeface2 = (android.graphics.Typeface) map5.get(str2);
                    if (typeface2 != null) {
                        typefaceCreateFromAsset = typeface2;
                    } else {
                        android.graphics.Typeface typeface3 = getname.RemoteActionCompatParcelizer;
                        if (typeface3 != null) {
                            typefaceCreateFromAsset = typeface3;
                        } else {
                            typefaceCreateFromAsset = android.graphics.Typeface.createFromAsset((AssetManager) dropShadowEffect.serializer, "fonts/" + str2 + ((String) dropShadowEffect.MediaDescriptionCompat));
                            map5.put(str2, typefaceCreateFromAsset);
                        }
                    }
                    boolean zContains = str.contains("Italic");
                    boolean zContains2 = str.contains("Bold");
                    if (zContains && zContains2) {
                        i2 = 3;
                    } else if (zContains) {
                        i2 = 2;
                    } else {
                        i2 = zContains2 ? 1 : 0;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i2) {
                        typefaceCreateFromAsset = android.graphics.Typeface.create(typefaceCreateFromAsset, i2);
                    }
                    map4.put(tozui_graphics, typefaceCreateFromAsset);
                }
            }
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = getname.RemoteActionCompatParcelizer;
            }
            if (typefaceCreateFromAsset != null) {
                String str16 = getminvalue.PlaybackStateCompatCustomAction;
                copyzey9i6wdefault3.setTypeface(typefaceCreateFromAsset);
                float f9 = getminvalue.MediaSessionCompatQueueItem;
                copyzey9i6wdefault3.setTextSize(newD50Xyzui_graphics.IconCompatParcelizer() * f9);
                copyzey9i6wdefault5.setTypeface(copyzey9i6wdefault3.getTypeface());
                copyzey9i6wdefault5.setTextSize(copyzey9i6wdefault3.getTextSize());
                fFloatValue = getminvalue.MediaSessionCompatResultReceiverWrapper / 10.0f;
                if (gettransformui_graphics != null) {
                    fFloatValue += ((Float) gettransformui_graphics.IconCompatParcelizer()).floatValue();
                }
                fIconCompatParcelizer = ((newD50Xyzui_graphics.IconCompatParcelizer() * fFloatValue) * f9) / 100.0f;
                listAsList = Arrays.asList(str16.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str7, "\r").split("\r"));
                size = listAsList.size();
                i3 = -1;
                i4 = 0;
                length = 0;
                while (i4 < size) {
                    String str17 = (String) listAsList.get(i4);
                    pointF = getminvalue.serializer;
                    if (pointF == null) {
                        f = 0.0f;
                    } else {
                        f = pointF.x;
                    }
                    listIconCompatParcelizer = IconCompatParcelizer(str17, f, getname, 0.0f, fIconCompatParcelizer, false);
                    i5 = 0;
                    while (i5 < listIconCompatParcelizer.size()) {
                        getciexyz = (getCieXyz) listIconCompatParcelizer.get(i5);
                        i6 = i3 + 1;
                        canvas.save();
                        if (serializer(canvas, getminvalue, i6, copyzey9i6wdefault3.measureText(getciexyz.read))) {
                            string = getciexyz.read;
                            if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                                bidi = new Bidi(string, -2);
                                runCount = bidi.getRunCount();
                                bArr = new byte[runCount];
                                numArr = new Integer[runCount];
                                i10 = 0;
                                while (i10 < runCount) {
                                    bArr[i10] = (byte) bidi.getRunLevel(i10);
                                    numArr[i10] = Integer.valueOf(i10);
                                    i10++;
                                    getname = getname;
                                }
                                getname2 = getname;
                                Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                sb2 = this.fullyDrawnReporter_delegatelambda00;
                                sb2.setLength(0);
                                i11 = 0;
                                while (i11 < runCount) {
                                    int iIntValue2 = numArr[i11].intValue();
                                    int i24 = runCount;
                                    int runStart2 = bidi.getRunStart(iIntValue2);
                                    Integer[] numArr3 = numArr;
                                    int runLimit2 = bidi.getRunLimit(iIntValue2);
                                    runLevel = bidi.getRunLevel(iIntValue2);
                                    strSubstring = string.substring(runStart2, runLimit2);
                                    if ((runLevel & 1) == 0) {
                                        sb2.append(strSubstring);
                                        str4 = string;
                                    } else {
                                        sb3 = this.getSavedStateRegistryControllerannotations;
                                        length3 = 0;
                                        sb3.setLength(0);
                                        while (length3 < strSubstring.length()) {
                                            String strWrite3 = write(length3, strSubstring);
                                            sb3.insert(0, strWrite3);
                                            length3 += strWrite3.length();
                                            string = string;
                                        }
                                        str4 = string;
                                        sb2.append((CharSequence) sb3);
                                    }
                                    i11++;
                                    runCount = i24;
                                    numArr = numArr3;
                                    bidi = bidi;
                                    string = str4;
                                }
                                string = sb2.toString();
                            } else {
                                getname2 = getname;
                            }
                            arrayList = this._init_lambda2;
                            arrayList.clear();
                            length2 = 0;
                            while (length2 < string.length()) {
                                String strWrite4 = write(length2, string);
                                arrayList.add(strWrite4);
                                length2 += strWrite4.length();
                            }
                            i7 = 0;
                            while (i7 < arrayList.size()) {
                                sb = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                                sb.setLength(0);
                                sb.append((String) arrayList.get(i7));
                                i8 = i7 + 1;
                                while (i8 < arrayList.size()) {
                                    str3 = (String) arrayList.get(i8);
                                    i9 = 0;
                                    while (true) {
                                        if (i9 < str3.length()) {
                                            break;
                                            break;
                                        }
                                        arrayList2 = arrayList;
                                        if (Character.getDirectionality(str3.codePointAt(i9)) == 2) {
                                            break;
                                        }
                                        i9++;
                                        arrayList = arrayList2;
                                    }
                                    sb.insert(0, str3);
                                    i8++;
                                    arrayList = arrayList2;
                                }
                                ArrayList arrayList6 = arrayList;
                                string2 = sb.toString();
                                serializer(getminvalue, i, i7 + length);
                                if (getminvalue.RatingCompat) {
                                    RemoteActionCompatParcelizer(string2, copyzey9i6wdefault3, canvas);
                                    RemoteActionCompatParcelizer(string2, copyzey9i6wdefault5, canvas);
                                } else {
                                    RemoteActionCompatParcelizer(string2, copyzey9i6wdefault5, canvas);
                                    RemoteActionCompatParcelizer(string2, copyzey9i6wdefault3, canvas);
                                }
                                canvas.translate(copyzey9i6wdefault3.measureText(string2) + fIconCompatParcelizer, 0.0f);
                                i7 = i8;
                                arrayList = arrayList6;
                            }
                        } else {
                            size = size;
                            i6 = i6;
                            getname2 = getname;
                        }
                        length += getciexyz.read.length();
                        canvas.restore();
                        i5++;
                        listIconCompatParcelizer = listIconCompatParcelizer;
                        listAsList = listAsList;
                        size = size;
                        i3 = i6;
                        getname = getname2;
                    }
                    i4++;
                    c = 2;
                    size = size;
                    getname = getname;
                }
            }
        }
        canvas.restore();
    }

    public static void RemoteActionCompatParcelizer(android.graphics.Path path, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == android.graphics.Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public static void RemoteActionCompatParcelizer(String str, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == android.graphics.Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final List IconCompatParcelizer(String str, float f, getName getname, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                int i5 = isSrgb.read(cCharAt, getname.read, getname.serializer);
                accessprocessDragStart accessprocessdragstart = this._init_lambda3.RemoteActionCompatParcelizer;
                accessprocessdragstart.getClass();
                isSrgb issrgb = (isSrgb) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i5);
                if (issrgb != null) {
                    fMeasureText = (newD50Xyzui_graphics.IconCompatParcelizer() * ((float) issrgb.write) * f2) + f3;
                }
            } else {
                fMeasureText = this.addObserverForBackInvokerlambda0.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                getCieXyz getciexyzIconCompatParcelizer = IconCompatParcelizer(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = strTrim.length() - strSubstring.length();
                    getciexyzIconCompatParcelizer.read = strTrim;
                    getciexyzIconCompatParcelizer.RemoteActionCompatParcelizer = (f4 - fMeasureText) - (length * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = strSubstring2.length() - strTrim2.length();
                    getciexyzIconCompatParcelizer.read = strTrim2;
                    getciexyzIconCompatParcelizer.RemoteActionCompatParcelizer = ((f4 - f5) - (length2 * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            getCieXyz getciexyzIconCompatParcelizer2 = IconCompatParcelizer(i);
            getciexyzIconCompatParcelizer2.read = str.substring(i2);
            getciexyzIconCompatParcelizer2.RemoteActionCompatParcelizer = f4;
        }
        return this.addOnConfigurationChangedListener.subList(0, i);
    }
}
