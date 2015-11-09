package com.ulticraft.composite;

import org.bukkit.Location;
import com.ulticraft.Ulticraft;
import com.ulticraft.uapi.UList;
import com.ulticraft.uapi.VectorFilter;

public class ParticleSystem
{
	private UList<Particle> particles;
	
	public ParticleSystem()
	{
		particles = new UList<Particle>();
	}
	
	public void render(Location center)
	{
		for(Particle i : particles)
		{
			i.draw(center);
		}
	}
	
	public void renderSlow(Ulticraft pl, Location center, int rpt)
	{
		final UList<Particle> particles = this.particles.copy();
		final int[] mt = new int[2];
		
		mt[1] = 0;
		mt[0] = pl.scheduleSyncRepeatingTask(0, 0, new Runnable()
		{
			@Override
			public void run()
			{
				for(int i = 0; i < rpt; i++)
				{
					if(particles.hasIndex(i))
					{
						mt[1]++;
						particles.get(i).draw(center);
					}
					
					else
					{
						pl.cancelTask(mt[0]);
					}
				}
			}
		});
	}
	
	public void applyFilter(VectorFilter filter)
	{
		for(Particle i : particles)
		{
			i.setRelativeLocation(filter.apply(i.getRelativeLocation()));
		}
	}
	
	public void addParticle(Particle p)
	{
		particles.add(p);
	}

	public UList<Particle> getParticles()
	{
		return particles;
	}

	public void setParticles(UList<Particle> particles)
	{
		this.particles = particles;
	}
}
