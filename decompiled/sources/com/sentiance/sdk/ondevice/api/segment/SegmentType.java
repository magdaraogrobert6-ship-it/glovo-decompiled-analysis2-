package com.sentiance.sdk.ondevice.api.segment;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public enum SegmentType {
    AGGRESSIVE_DRIVER(20000),
    ANTICIPATIVE_DRIVER(20001),
    BAR_GOER(20002),
    CITY_DRIVER(20200),
    CITY_HOME(20201),
    CITY_WORKER(20202),
    CULTURE_BUFF(20302),
    DIE_HARD_DRIVER(20303),
    DISTRACTED_DRIVER(20304),
    DOG_WALKER(20306),
    EARLY_BIRD(20307),
    EASY_COMMUTER(20308),
    EFFICIENT_DRIVER(20309),
    FOODIE(20311),
    FREQUENT_FLYER(20312),
    FULLTIME_WORKER(20313),
    GREEN_COMMUTER(20315),
    HEALTHY_BIKER(20400),
    HEALTHY_WALKER(20401),
    HEAVY_COMMUTER(20500),
    HOME_BOUND(20700),
    HOMEBODY(20701),
    HOMEWORKER(20702),
    ILLEGAL_DRIVER(20703),
    LATE_WORKER(20704),
    LEGAL_DRIVER(20705),
    LONG_COMMUTER(20706),
    MOBILITY(20800),
    MOBILITY__HIGH(20801),
    MOBILITY__LIMITED(20802),
    MOBILITY__MODERATE(20803),
    MOTORWAY_DRIVER(20900),
    MUSIC_LOVER(20901),
    NATURE_LOVER(20902),
    NIGHT_OWL(20903),
    NIGHTWORKER(20904),
    NORMAL_COMMUTER(20905),
    PARTTIME_WORKER(20906),
    PET_OWNER(20907),
    PHYSICAL_ACTIVITY__HIGH(21000),
    PHYSICAL_ACTIVITY__LIMITED(21001),
    PHYSICAL_ACTIVITY__MODERATE(21002),
    PUBLIC_TRANSPORTS_COMMUTER(21100),
    PUBLIC_TRANSPORTS_USER(21101),
    RECENTLY_CHANGED_JOB(21200),
    RECENTLY_MOVED_HOME(21201),
    RESTO_LOVER(21300),
    RURAL_HOME(21400),
    RURAL_WORKER(21401),
    SHOPAHOLIC(21402),
    SHORT_COMMUTER(21403),
    SLEEP_DEPRIVED(21404),
    SOCIAL_ACTIVITY(21500),
    SOCIAL_ACTIVITY__HIGH(21501),
    SOCIAL_ACTIVITY__LIMITED(21502),
    SOCIAL_ACTIVITY__MODERATE(21503),
    SPORTIVE(21600),
    STUDENT(21601),
    TOWN_HOME(21602),
    TOWN_WORKER(21603),
    UBER_PARENT(21604),
    WORK_LIFE_BALANCE(21800),
    WORK_TRAVELLER(21801),
    WORKAHOLIC(21802);

    private final int uniqueId;

    public int getUniqueId() {
        return this.uniqueId;
    }

    SegmentType(int i) {
        this.uniqueId = i;
    }

    public static SegmentType fromEngineCategory(int i) {
        for (SegmentType segmentType : values()) {
            if (segmentType.uniqueId == i) {
                return segmentType;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return super.toString().replace("__", ".");
    }
}
