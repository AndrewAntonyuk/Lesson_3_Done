package members;

public class Racetrack extends Barricade{
    //region Constructors
    public Racetrack() {
        super("Racetrack");
    }
    public Racetrack(String name) {
        this();
        instanceName = name;
    }
    public Racetrack(String name, Double lim) {
        this();
        instanceName = name;
        limit = lim;
    }
    //endregion
    @Override
    public Boolean overcome(Member m) {
        Boolean ret = false;
        m.run();
        System.out.println(getName() + " with name " + getInstanceName() + ":");
        if(m.getMaxDistance() > limit){
            System.out.println(m.getName() + " with name " + m.instanceName
                    + " passed " + getName() + " with name " + instanceName
                    + " on the distance " + limit);
        }else{
            ret = true;
            System.out.println(m.getName() + " with name " + m.instanceName
                    + " didn't pass " + getName() + " with name " + instanceName
                    + " on the distance " + limit + ". Passed: " + m.getMaxDistance());
        }

        return ret;
    }
}
