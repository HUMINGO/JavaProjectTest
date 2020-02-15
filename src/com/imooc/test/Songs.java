package com.imooc.test;

public class Songs {
	
	private String id;//歌曲ID
	private String name;//歌曲名称
	private String player;//歌曲作者
	
	public Songs() {
		
	}
	
	public Songs(String id,String name,String player) {
		this.id=id;
		this.name=name;
		this.player=player;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj.getClass()==Songs.class) {
			Songs song=(Songs)obj;
			return song.getId().equals(id)&&song.getName().equals(name)&&song.getPlayer().equals(player);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Songs [id=" + id + ", 歌曲名称=" + name + ", 歌手=" + player + "]";
	}
	
	
	
}
