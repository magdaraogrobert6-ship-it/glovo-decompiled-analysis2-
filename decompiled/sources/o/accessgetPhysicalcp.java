package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class accessgetPhysicalcp {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[getChildren.values().length];
        try {
            iArr[getChildren.Background.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[getChildren.Error.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[getChildren.ErrorContainer.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[getChildren.InverseOnSurface.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[getChildren.InversePrimary.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[getChildren.InverseSurface.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[getChildren.OnBackground.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[getChildren.OnError.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[getChildren.OnErrorContainer.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[getChildren.OnPrimary.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[getChildren.OnPrimaryContainer.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[getChildren.OnSecondary.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[getChildren.OnSecondaryContainer.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[getChildren.OnSurface.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[getChildren.OnSurfaceVariant.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[getChildren.SurfaceTint.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[getChildren.OnTertiary.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[getChildren.OnTertiaryContainer.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[getChildren.Outline.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[getChildren.OutlineVariant.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[getChildren.Primary.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[getChildren.PrimaryContainer.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[getChildren.Scrim.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[getChildren.Secondary.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[getChildren.SecondaryContainer.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[getChildren.Surface.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[getChildren.SurfaceVariant.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[getChildren.SurfaceBright.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[getChildren.SurfaceContainer.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[getChildren.SurfaceContainerHigh.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[getChildren.SurfaceContainerHighest.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[getChildren.SurfaceContainerLow.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[getChildren.SurfaceContainerLowest.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[getChildren.SurfaceDim.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[getChildren.Tertiary.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[getChildren.TertiaryContainer.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[getChildren.PrimaryFixed.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[getChildren.PrimaryFixedDim.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[getChildren.OnPrimaryFixed.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[getChildren.OnPrimaryFixedVariant.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[getChildren.SecondaryFixed.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[getChildren.SecondaryFixedDim.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[getChildren.OnSecondaryFixed.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[getChildren.OnSecondaryFixedVariant.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[getChildren.TertiaryFixed.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[getChildren.TertiaryFixedDim.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[getChildren.OnTertiaryFixed.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[getChildren.OnTertiaryFixedVariant.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        serializer = iArr;
    }
}
