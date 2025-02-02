import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 재생 횟수 총합을 저장할 HashMap
        Map<String, Integer> genrePlayCount = new HashMap<>();
        // 장르별 곡 정보를 저장할 List
        Map<String, List<Song>> genreSongs = new HashMap<>();

        // 장르별 재생 횟수 총합 계산 및 곡 정보 저장
        for (int i = 0; i < genres.length; i++) {
            genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
            genreSongs.putIfAbsent(genres[i], new ArrayList<>());
            genreSongs.get(genres[i]).add(new Song(i, plays[i]));
        }

        // 장르를 재생 횟수 기준으로 내림차순 정렬
        List<Map.Entry<String, Integer>> genreList = new ArrayList<>(genrePlayCount.entrySet());
        genreList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        List<Integer> result = new ArrayList<>();

        // 각 장르에 대해 최대 두 곡 선택
        for (Map.Entry<String, Integer> entry : genreList) {
            String genre = entry.getKey();
            List<Song> songs = genreSongs.get(genre);
            // 곡을 재생 횟수 기준으로 내림차순 정렬
            songs.sort((a, b) -> {
                if (b.plays == a.plays) {
                    return Integer.compare(a.index, b.index); // 고유 번호 기준 정렬
                }
                return Integer.compare(b.plays, a.plays);
            });

            // 최대 두 곡 추가
            for (int j = 0; j < Math.min(2, songs.size()); j++) {
                result.add(songs.get(j).index);
            }
        }

        // 결과를 int 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }

    // 곡 정보를 저장할 클래스
    static class Song {
        int index;
        int plays;

        Song(int index, int plays) {
            this.index = index;
            this.plays = plays;
        }
    }
}