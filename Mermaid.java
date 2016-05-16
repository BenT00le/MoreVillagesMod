

public class MerMaidVillager extends EntityVillager 
{
	public MerMaidVillager(World worldIn) 
	{
		super(worldIn);
		this.setSize(1.0F,2.0F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this,2.0D));
		this.tasks.addTask(2, new EntityAIWander(this,1.3D));
	}
	public boolean isPushedByWater()
	{
		return false;
	}
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
		this.setAir(300);
		this.limbSwing = 0;
		this.limbSwingAmount = 0;
		this.prevLimbSwingAmount = this.limbSwing;
		if(!this.isInWater())
		{
			this.kill();
		}
	}
	public boolean canBreathUnderwater()
	{
		return true;
	}

}
