package com.mapbox.navigation.base.internal.maneuver;

import com.mapbox.navigation.base.maneuver.model.BaseTurnIconResources;
import java.util.Map;
import kotlin.math.MathKt;
import o.IconCompatParcelizer;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class TurnIconHelper {
    public final IconSpec defaultTurnIcon;
    public final Map iconMap;

    public final class IconSpec {
        public final boolean drivingSideFlippable;
        public final int icon;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.icon);
            boolean z = this.drivingSideFlippable;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return (iHashCode * 31) + r1;
        }

        public IconSpec(int i, boolean z) {
            this.icon = i;
            this.drivingSideFlippable = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconSpec)) {
                return false;
            }
            IconSpec iconSpec = (IconSpec) obj;
            return this.icon == iconSpec.icon && this.drivingSideFlippable == iconSpec.drivingSideFlippable;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconSpec(icon=");
            sb.append(this.icon);
            sb.append(", drivingSideFlippable=");
            return IconCompatParcelizer.IconCompatParcelizer(sb, this.drivingSideFlippable, ')');
        }
    }

    public TurnIconHelper(BaseTurnIconResources baseTurnIconResources) {
        this.defaultTurnIcon = new IconSpec(baseTurnIconResources.getTurnIconTurnStraight(), false);
        this.iconMap = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair(null, null), new IconSpec(baseTurnIconResources.getTurnIconTurnStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("", ""), new IconSpec(baseTurnIconResources.getTurnIconTurnStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("arrive", null), new IconSpec(baseTurnIconResources.getTurnIconArrive(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("depart", null), new IconSpec(baseTurnIconResources.getTurnIconDepart(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("on ramp", null), new IconSpec(baseTurnIconResources.getTurnIconOnRamp(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("off ramp", null), new IconSpec(baseTurnIconResources.getTurnIconOffRamp(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("fork", null), new IconSpec(baseTurnIconResources.getTurnIconFork(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("turn", null), new IconSpec(baseTurnIconResources.getTurnIconTurnStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("merge", null), new IconSpec(baseTurnIconResources.getTurnIconMergeStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("end of road", null), new IconSpec(baseTurnIconResources.getTurnIconEndRoadLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair(null, "left"), new IconSpec(baseTurnIconResources.getTurnIconTurnLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair(null, "right"), new IconSpec(baseTurnIconResources.getTurnIconTurnRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair(null, "straight"), new IconSpec(baseTurnIconResources.getTurnIconTurnStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair(null, "uturn"), new IconSpec(baseTurnIconResources.getTurnIconUturn(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair(null, "slight left"), new IconSpec(baseTurnIconResources.getTurnIconTurnSlightLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair(null, "slight right"), new IconSpec(baseTurnIconResources.getTurnIconTurnSlightRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair(null, "sharp left"), new IconSpec(baseTurnIconResources.getTurnIconTurnSharpLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair(null, "sharp right"), new IconSpec(baseTurnIconResources.getTurnIconTurnSharpRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("arrive", "left"), new IconSpec(baseTurnIconResources.getTurnIconArriveLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("arrive", "right"), new IconSpec(baseTurnIconResources.getTurnIconArriveRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("arrive", "straight"), new IconSpec(baseTurnIconResources.getTurnIconArriveStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("depart", "left"), new IconSpec(baseTurnIconResources.getTurnIconDepartLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("depart", "right"), new IconSpec(baseTurnIconResources.getTurnIconDepartRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("depart", "straight"), new IconSpec(baseTurnIconResources.getTurnIconDepartStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("end of road", "left"), new IconSpec(baseTurnIconResources.getTurnIconEndRoadLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("end of road", "right"), new IconSpec(baseTurnIconResources.getTurnIconEndRoadRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("fork", "left"), new IconSpec(baseTurnIconResources.getTurnIconForkLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("fork", "right"), new IconSpec(baseTurnIconResources.getTurnIconForkRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("fork", "straight"), new IconSpec(baseTurnIconResources.getTurnIconForkStraight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("fork", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconForkSlightLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("fork", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconForkSlightRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("merge", "left"), new IconSpec(baseTurnIconResources.getTurnIconMergeLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("merge", "right"), new IconSpec(baseTurnIconResources.getTurnIconMergeRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("merge", "straight"), new IconSpec(baseTurnIconResources.getTurnIconMergeStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("merge", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconMergeSlightLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("merge", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconMergeSlightRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("off ramp", "left"), new IconSpec(baseTurnIconResources.getTurnIconOffRampLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("off ramp", "right"), new IconSpec(baseTurnIconResources.getTurnIconOffRampRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("off ramp", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconOffRampSlightLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("off ramp", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconOffRampSlightRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("on ramp", "left"), new IconSpec(baseTurnIconResources.getTurnIconOnRampLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("on ramp", "right"), new IconSpec(baseTurnIconResources.getTurnIconOnRampRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("on ramp", "straight"), new IconSpec(baseTurnIconResources.getTurnIconOnRampStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("on ramp", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconOnRampSlightLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("on ramp", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconOnRampSlightRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("on ramp", "sharp left"), new IconSpec(baseTurnIconResources.getTurnIconOnRampSharpLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("on ramp", "sharp right"), new IconSpec(baseTurnIconResources.getTurnIconOnRampSharpRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("turn", "left"), new IconSpec(baseTurnIconResources.getTurnIconTurnLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("turn", "right"), new IconSpec(baseTurnIconResources.getTurnIconTurnRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("turn", "uturn"), new IconSpec(baseTurnIconResources.getTurnIconUturn(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("turn", "straight"), new IconSpec(baseTurnIconResources.getTurnIconTurnStraight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("turn", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconTurnSlightLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("turn", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconTurnSlightRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("turn", "sharp left"), new IconSpec(baseTurnIconResources.getTurnIconTurnSharpLeft(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("turn", "sharp right"), new IconSpec(baseTurnIconResources.getTurnIconTurnSharpRight(), false)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout", "left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout", "right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout", "straight"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutStraight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout", "sharp left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout", "sharp right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout turn", "left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout turn", "right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout turn", "straight"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutStraight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout turn", "sharp left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout turn", "sharp right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout turn", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("roundabout turn", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit roundabout", "left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit roundabout", "right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit roundabout", "straight"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutStraight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit roundabout", "sharp left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit roundabout", "sharp right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit roundabout", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit roundabout", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("rotary", "left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("rotary", "right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("rotary", "straight"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutStraight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("rotary", "sharp left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("rotary", "sharp right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("rotary", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("rotary", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit rotary", "left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit rotary", "right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit rotary", "straight"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutStraight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit rotary", "sharp left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit rotary", "sharp right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSharpRight(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit rotary", "slight left"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightLeft(), true)), new onViewAttachedToWindowlambda0(new ManeuverTypeModifierPair("exit rotary", "slight right"), new IconSpec(baseTurnIconResources.getTurnIconRoundaboutSlightRight(), true)));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    public final ManeuverTurnIcon retrieveTurnIcon(String str, Float f, String str2, String str3) {
        IconSpec iconSpec;
        boolean z;
        String str4;
        Map map = this.iconMap;
        if (str != null && str.length() != 0 && (str.equals("roundabout") || str.equals("roundabout turn") || str.equals("exit roundabout") || str.equals("rotary") || str.equals("exit rotary"))) {
            if (f != null) {
                float fWrite = MathKt.write(f.floatValue() / 45.0f) * 45.0f;
                if (fWrite == 0.0f || fWrite == 45.0f) {
                    str4 = "sharp right";
                } else if (fWrite == 90.0f) {
                    str4 = "right";
                } else if (fWrite == 135.0f) {
                    str4 = "slight right";
                } else if (fWrite == 180.0f) {
                    str4 = "straight";
                } else if (fWrite == 225.0f) {
                    str4 = "slight left";
                } else if (fWrite == 270.0f) {
                    str4 = "left";
                } else if (fWrite == 315.0f || fWrite == 360.0f) {
                    str4 = "sharp left";
                } else {
                    str4 = null;
                }
            } else {
                str4 = null;
            }
            iconSpec = (IconSpec) map.get(new ManeuverTypeModifierPair(str, str4));
        } else {
            iconSpec = (IconSpec) map.get(new ManeuverTypeModifierPair(str, str2));
            if (iconSpec == null) {
                iconSpec = this.defaultTurnIcon;
            }
        }
        if (iconSpec == null) {
            return null;
        }
        if (!iconSpec.drivingSideFlippable) {
            z = false;
        } else if (str3 == null || str3.length() == 0 || !str3.equals("left")) {
            if (str3 != null && str3.length() != 0) {
                str3.equals("right");
            }
            z = false;
        } else {
            z = true;
        }
        return new ManeuverTurnIcon(f, str3, z, Integer.valueOf(iconSpec.icon));
    }
}
